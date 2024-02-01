package org.example.functionalprogramming.streams;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TerminalOperations {

    /*
     * joining() -> String concatenation on the elements in the stream
     * counting() -> Collector returns the total number of elements as a result
     * mapping() -> collector applies a transformation function first and then collects the data
     * maxBy() -> returns max element takes comparator as an input parameter and optional as an output
     * minBy() -> returns min element takes comparator as an input parameter and optional as an output
     * summingInt() -> returns sum as a result
     * averageint() -> returns average as a result
     * groupingBy() -> based elements based on property ...gives an output Map<K,V>
     * */

    private static List<Student> studentList = InitStudents.STUDENT_LIST;
    private static Predicate<Integer> studentPredicate = number -> number < 30;

    public static void streamsJoining() {
        System.out.println("Joining ");
        String nameJoin = studentList.stream().map(Student::getName).collect(Collectors.joining());
        System.out.println(nameJoin);
        nameJoin = studentList.stream().map(Student::getName).collect(Collectors.joining("-"));
        System.out.println(nameJoin);
        nameJoin = studentList.stream().map(Student::getName).collect(Collectors.joining("-", "(", ")"));
        System.out.println(nameJoin + "\n");
    }

    public static void streamsCounting() {
        System.out.println("Counting");
        long result = studentList.stream().filter(s -> studentPredicate.test(s.getAge())).collect(Collectors.counting());
        System.out.println("Result : " + result + "\n");
    }

    public static void streamsMapping() {
        List<String> nameList = studentList.stream()
                .filter(student -> studentPredicate.test(student.getAge()))
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println("Mapping");
        System.out.println("nameList : " + nameList + "\n");
    }

    public static void collectionsSort() {
        List<String> sortedList = studentList.stream()
                .map(Student::getName)
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println("collectionsSort");
        System.out.println("collectionsSort : " + sortedList + "\n");
    }

    public static void maxByMinBy() {
        Comparator<String> stringComparator = Comparator.naturalOrder();
        Optional<String> lastNameOpt = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.maxBy(stringComparator));
        String lastName = lastNameOpt.isPresent() ? lastNameOpt.get() : "NoName";
        System.out.println("MaxBy : " + lastName);

        Optional<String> firstNameOpt = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.minBy(stringComparator));
        String firstName = firstNameOpt.isPresent() ? firstNameOpt.get() : "NoName";
        System.out.println("MaxBy : " + firstName + "\n");

    }

    public static void streamsSummingInt() {
        int result = studentList.stream()
                .collect(Collectors.summingInt(Student::getAge));
        System.out.print("Summing result : ");
        System.out.println(result);
    }

    public static void streamsAverageInt() {
        double result = studentList.stream()
                .collect(Collectors.averagingInt(Student::getAge));
        System.out.print("Averaging result : ");
        System.out.println(result + "\n");
    }

    public static void streamsGroupingBy() {
        Map<String, List<Student>> map = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
        System.out.println("GroupingBy");
        map.forEach(
                (k, v) -> {
                    System.out.println("Group : " + k);
                    List<String> nameList = v.stream().map(Student::getName).toList();
                    System.out.println("Students : " + nameList);
                }
        );
    }


    public static void main(String[] args) {
        streamsJoining();
        streamsCounting();
        streamsMapping();
        collectionsSort();
        maxByMinBy();
        streamsSummingInt();
        streamsAverageInt();
        streamsGroupingBy();
    }
}
