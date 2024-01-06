package org.example.oops.myenum;

public class EnumMain {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.MONDAY;
        System.out.println(day);

        boolean weekOff = DaysOfWeek.MONDAY.getWeekOff();
        System.out.println(weekOff);

        System.out.println("days in DaysOfWeek");
        for (DaysOfWeek days : DaysOfWeek.values()) {
            System.out.println(days + " : " + days.getWeekOff());
        }
    }
}
