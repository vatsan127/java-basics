package org.example.functionalprogramming.consumer;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyConsumer {
    /*Operations
     * accept()
     * andThen()
     */

    private static String[] studentNameArr = InitStudents.NAMES_LIST;
    private static List<String> studentNameList = Arrays.asList(studentNameArr);
    private static List<Student> studentList = InitStudents.STUDENT_LIST;


    public static void consumerFunc() {
        /*Consumer 1*/
        System.out.println("studentConsumerPrintName");
        Consumer<String> studentConsumerPrintName = studentName -> System.out.print(studentName + " ");
        studentNameList.forEach(studentName -> studentConsumerPrintName.accept(studentName));
        System.out.println("\n");

        /*Consumer 2*/
        System.out.println("studentConsumerPrintDetails");
        Consumer<Student> studentConsumerPrintDetails = student -> System.out.println(student.toString());
        studentList.forEach(student -> studentConsumerPrintDetails.accept(student));
    }

    public static void main(String[] args) {
        System.out.println("ConsumerFunc");
        consumerFunc();
    }
}
