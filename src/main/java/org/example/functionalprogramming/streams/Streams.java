package org.example.functionalprogramming.streams;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {
    private static final List<Student> studentList = InitStudents.STUDENT_LIST;

    public static void distinct() {
        List<String> distinctGradeList = studentList.stream()
                .map(Student::getGrade)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Grade List ");
        distinctGradeList.forEach(System.out::print);
    }

    public static void count() {
        Long count = studentList.stream()
                .count();
        System.out.println("Student List Count : " + count);
    }

    public static void filter() {
        Predicate<Student> checkAgeLessThan30 = student -> student.getAge() < 30;
        List<String> studentsAgeLessThan30 = studentList.stream()
                .filter(student -> checkAgeLessThan30.test(student))
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Students Age less than 30 count : " + studentsAgeLessThan30);
    }


    public static void sorted() {
        Comparator<Student> compareByNameAsc = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Student> compareByNameDesc = new Comparator<Student>() {
            @Override
            public int compare(Student o2, Student o1) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        List<String> nameList = studentList.stream()
                .sorted(compareByNameAsc)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Sorted Student NameList : " + nameList);
    }

    public static void main(String[] args) {
        System.out.println("Distinct");
        distinct();
        System.out.println("\nCount");
        count();
        System.out.println("\nFilter");
        filter();
        System.out.println("\nSorted");
        sorted();
    }
}
