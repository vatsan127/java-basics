package org.example.functionalprogramming.predicate;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class MyBiPredicate {

    private static List<Student> studentList = InitStudents.STUDENT_LIST;
    public static Consumer<Student> studentConsumer = student -> System.out.println(student.toString());

    public static void biPredicateFunc() {
        /*Age Greater than 30 and Grade = 'H'*/
        BiPredicate<Integer, String> checkAgeAndGrade = (age, grade) -> (age > 30 && grade.equals("H"));
        studentList.forEach(student -> {
            if (checkAgeAndGrade.test(student.getAge(), student.getGrade())) {
                studentConsumer.accept(student);
            }
        });
    }

    public static void main(String[] args) {
        biPredicateFunc();
    }
}


