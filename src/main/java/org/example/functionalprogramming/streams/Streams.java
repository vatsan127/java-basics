package org.example.functionalprogramming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.example.functionalprogramming.model.Student;

import static org.example.functionalprogramming.model.InitStudents.STUDENT_LIST;
import static org.example.functionalprogramming.model.InitStudents.NAMES_LIST;


public class Streams {

    public static void streamFilter() {
        Predicate<Student> filterByGrade = student -> student.getGrade().equals("H");
        Stream<Student> stream = STUDENT_LIST.stream().filter(filterByGrade);
        stream.forEach(s -> System.out.println(s.toString()));
    }

    private static void streamCount() {
        /*int count = studentsList.size();*/
        Long count = STUDENT_LIST.stream().count();
        System.out.println("Count : " + count);
    }

    private static void streamsInArrays() {
        List<String> nameStream = Arrays.stream(NAMES_LIST).collect(Collectors.toList());
        System.out.println("streamsInArrays : " + nameStream);

    }

    private static void streamMap() {
        Predicate<Student> filterByName = student -> student.getName().equalsIgnoreCase("naruto");
        List<Student> newStudentList = STUDENT_LIST.stream()
                .map(student ->
                        {
                            return new Student(student.getName(), student.getGrade(), student.getAge() + 10);
                        }
                )
                .collect(Collectors.toList());
        System.out.println("StreamMap");
        newStudentList.stream()
                .filter(filterByName)
                .forEach(s ->
                        {
                            System.out.println("name : " + s.getName());
                            System.out.println("grade : " + s.getGrade());
                            System.out.println("age : " + s.getAge());
                        }
                );
    }

    public static void main(String[] args) {
        /*STREAMS*/
        /*to process a collection of data in a declarative (functional) way */

        /*filter*/
        streamFilter();

        /*count*/
        streamCount();

        /*stream in Arrays*/
        streamsInArrays();

        /*map*/
        streamMap();

        /*flatMap*/
        
    }


}