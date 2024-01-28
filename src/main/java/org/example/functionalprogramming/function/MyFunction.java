package org.example.functionalprogramming.function;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MyFunction {
    private static List<Student> studentList = InitStudents.STUDENT_LIST;
    private static Consumer<Student> studentConsumer = student -> System.out.println(student.toString());

    public static void func() {
        /*Function 1*/
        Function<String, String> function = studentName -> {
            String firstChar = studentName.substring(0, 1).toUpperCase();
            String remainingChar = studentName.substring(1).toLowerCase();
            return firstChar.concat(remainingChar);
        };

        studentList.forEach(student -> {
            System.out.println(function.apply(student.getName()));
        });

    }

    public static void main(String[] args) {
        func();
    }

}
