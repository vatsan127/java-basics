package org.example.functionalprogramming.streams;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.List;
import java.util.function.Predicate;

public class Matches {
    /*
     * stream operations
     *      anyMatch() - true if anyone of the element matches the predicate
     *      allMatch() - true if all the elements matches the predicate
     *      noneMatch() - opposite of allMatch()
     * all these functions takes in a predicate as an input and returns a Boolean as an output
     * */

    private static List<Student> studentList = InitStudents.STUDENT_LIST;

    private static void streamMatches() {
        Predicate<String> matchName = name -> name.equalsIgnoreCase("naruto");

        boolean anyMatchResult = studentList.stream()
                .map(Student::getName)
                .anyMatch(matchName);
        System.out.println("anyMatchResult : " + anyMatchResult);

        boolean allMatchResult = studentList.stream()
                .map(Student::getName)
                .allMatch(matchName);
        System.out.println("anyMatchResult : " + allMatchResult);

        boolean noneMatchResult = studentList.stream()
                .map(Student::getName)
                .noneMatch(matchName);
        System.out.println("anyMatchResult : " + noneMatchResult);
    }

    public static void main(String[] args) {
        streamMatches();
    }

}
