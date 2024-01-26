package org.example.functionalprogramming.predicate;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyPredicate {
    /*Operations
     * test(predicate)
     * .and(predicate)
     * .or(predicate)
     * .negate()
     * */

    private static List<Student> studentList = InitStudents.STUDENT_LIST;
    public static Consumer<Student> studentConsumer = student -> System.out.println(student.toString());

    public static void predicateFunc() {
/*        Predicate<Integer> getEvenNumberPredicate = number -> number % 2 == 0;
        System.out.println(getEvenNumberPredicate.test(1));
        System.out.println(getEvenNumberPredicate.test(2));*/

        /*Age  Equal to 30*/
        System.out.println("Age equal to 30");
        Predicate<Integer> checkAgeEqualTo30 = age -> age == 30;
        studentList.forEach(student -> {
            if (checkAgeEqualTo30.test(student.getAge())) {
                studentConsumer.accept(student);
            }
        });

        /*Age Greater than 30*/
        System.out.println("\n Age Greater than 30 ");
        Predicate<Integer> checkAgeGreaterThan30 = age -> age > 30;
        studentList.forEach(student -> {
            if (checkAgeGreaterThan30.test(student.getAge())) {
                studentConsumer.accept(student);
            }
        });

        /*Age Greater than or Equal to 30*/
        System.out.println("\nAge Greater than or Equal to 30");
        studentList.forEach(student -> {
            if (checkAgeEqualTo30.or(checkAgeGreaterThan30).test(student.getAge())) {
                studentConsumer.accept(student);
            }
        });

        /*Age greater than 30  and Age is EVEN*/
        System.out.println("\nAge greater than 30  and Age is EVEN");
        Predicate<Integer> checkAgeIsEven = age -> age % 2 == 0;
        studentList.forEach(student -> {
            if (checkAgeGreaterThan30.and(checkAgeIsEven).test(student.getAge())) {
                studentConsumer.accept(student);
            }
        });
    }

    public static void main(String[] args) {
        predicateFunc();
    }
}
