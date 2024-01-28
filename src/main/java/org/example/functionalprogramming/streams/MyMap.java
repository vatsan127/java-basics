package org.example.functionalprogramming.streams;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyMap {
    /* convert one type to another*/

    private static List<Student> studentList = InitStudents.STUDENT_LIST;

    public static void map() {
        /*map to print lowercase Student name*/
        Function<String, String> convertLowerCase = String::toLowerCase;
        List<String> nameList = studentList.stream()
                .map(student -> convertLowerCase.apply(student.getName()))
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        map();
    }
}
