package org.example.functionalprogramming.consumer;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.List;
import java.util.function.BiConsumer;

public class MyBiConsumer {
    private static List<Student> studentList = InitStudents.STUDENT_LIST;

    public static void biConsumerFunc() {
        BiConsumer<String, Integer> studentConsumer = (name, age) -> {
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
        };
        studentList.forEach(student -> {
            studentConsumer.accept(student.getName(), student.getAge());
        });
    }

    public static void main(String[] args) {
        biConsumerFunc();
    }
}
