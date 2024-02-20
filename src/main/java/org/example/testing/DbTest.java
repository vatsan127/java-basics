package org.example.testing;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DbTest {


    private static Map<String, List<CommMessages>> commMessagesCache;

    private static Map<String, Map<String, List<CommVariables>>> commVariablesCache;

    private static final Object lockObj = new Object();

    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void initializeCommMessages() throws IOException, SQLException {

        String sq = "SELECT * FROM ECMP_T_COMM_MESSAGES";
        Map<String, List<CommMessages>> commMessagesCache = new ConcurrentHashMap<>();
        String commId = "";
        try (Connection con = getConnection()) {
            try (PreparedStatement ps = con.prepareStatement(sq)) {
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        commId = rs.getString("COMM_ID");
                        CommMessages commMessages = new CommMessages();
                        commMessages.setCommId(commId);
                        commMessages.setLangCode(rs.getString("LANG_CODE"));
                        commMessages.setSentence(rs.getString("SENTENCE"));
                        commMessages.setDCS((int) rs.getLong("DCS"));
                        commMessages.setFromSender(rs.getString("FROM_SENDER"));
                        commMessagesCache.putIfAbsent(commId, new ArrayList<CommMessages>());
                        commMessagesCache.get(commId).add(commMessages);
                    }
                }
            } catch (SQLException e) {
                System.out.println("Data not configured/table is empty :: [ECMP_T_COMM_MSG]" + e);
            }
        }

        synchronized (lockObj) {
            if (DbTest.commMessagesCache != null) {
                DbTest.commMessagesCache.clear();
            }
            DbTest.commMessagesCache = commMessagesCache;

        }
    }

    public static void initializeCommVariables() throws IOException, SQLException {

        long startTime = System.currentTimeMillis();

        String query = "SELECT * FROM ECMP_T_COMM_VARIABLES";
        Map<String, Map<String, List<CommVariables>>> commVariablesCache = new ConcurrentHashMap<>();
        String commId = "";
        String langCode = "";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                commId = rs.getString("COMM_ID");
                langCode = rs.getString("LANG_CODE");
                CommVariables commVariables = new CommVariables();
                commVariables.setCommId(commId);
                commVariables.setLangCode(langCode);
                commVariables.setKey(rs.getString("V_KEY"));
                commVariables.setValue(rs.getString("VALUE"));
                commVariables.setVarType(rs.getString("VAR_TYPE"));
                commVariables.setVersion(rs.getString("VERSION"));
                if (!commVariablesCache.containsKey(commId)) {
                    commVariablesCache.put(commId, new ConcurrentHashMap<>());
                }
                if (!commVariablesCache.get(commId).containsKey(langCode)) {
                    List<CommVariables> commVariablesList = new ArrayList<>();
                    commVariablesCache.get(commId).put(langCode, commVariablesList);
                }
                commVariablesCache.get(commId).get(langCode).add(commVariables);
            }
        } catch (Exception e) {
            System.out.println("Data not configured/table is empty :: [ECMP_T_COMM_VARIABLES]" + e);
        }

        synchronized (lockObj) {
            if (DbTest.commVariablesCache != null) {
                DbTest.commVariablesCache.clear();
            }
            DbTest.commVariablesCache = commVariablesCache;

        }
        long endTime = System.currentTimeMillis();
        System.out.println("TimeTaken : "+(endTime-startTime));
    }
    public static void main(String[] args) throws SQLException, IOException {
        //            [ECMP_T_COMM_MESSAGES,  ECMP_T_COMM_VARIABLES]
        List<String> tableList = new ArrayList<>();
        tableList.add("ECMP_T_COMM_MESSAGES");
        tableList.add(" ECMP_T_COMM_VARIABLES");
        if (tableList.contains("ECMP_T_COMM_MESSAGES")) {
            System.out.println("In CommVariables");
            DbTest.initializeCommMessages();
        }
        if (tableList.contains("ECMP_T_COMM_VARIABLES")) {
            System.out.println("In CommVariables");
            DbTest.initializeCommVariables();
        }
    }
}
