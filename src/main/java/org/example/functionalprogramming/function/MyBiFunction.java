package org.example.functionalprogramming.function;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class MyBiFunction {
    private static List<Student> studentList = InitStudents.STUDENT_LIST;

    public static void bifunc() {
        BiFunction<String, Integer, Map<String, Integer>> biFunction = (name, age) -> {
            Map<String, Integer> studentMap = new HashMap<>();
            studentMap.put(name, age);
            return studentMap;
        };

        studentList.forEach(student -> {
            Map<String, Integer> map = biFunction.apply(student.getName(), student.getAge());
            System.out.println(map);
        });
    }

    public static void main(String[] args) {
        bifunc();
    }
}
