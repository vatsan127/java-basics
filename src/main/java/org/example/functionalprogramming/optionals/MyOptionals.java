package org.example.functionalprogramming.optionals;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MyOptionals {
    public static Optional<Student> getFilteredStudents() {
        Predicate<Student> filterByAge = student -> student.getAge() > 100;
        List<Student> studentList = InitStudents.STUDENT_LIST;
        return studentList.stream().filter(filterByAge).findFirst();
    }

    public static Optional<String> getNullValues() {
        return Optional.ofNullable(null);
    }

    public static Optional<String> getNotNullValues() {
        return Optional.ofNullable("No Null Value");
    }


    public static void main(String[] args) {
        Optional<Student> filteredStudents = getFilteredStudents();
        /* .isPresent() */
        if (filteredStudents.isPresent()) {
            System.out.println(filteredStudents.toString());
        } else {
            System.out.println("No Student");
        }

        /*Optional.ofNullable*/
        Optional<String> nullValues = getNullValues();
        System.out.println(nullValues.orElse("There is null value"));

        Optional<String> notNullValues = getNotNullValues();
        System.out.println(notNullValues.orElse("There is null value"));
    }
}
