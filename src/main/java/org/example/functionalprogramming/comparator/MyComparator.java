package org.example.functionalprogramming.comparator;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import javax.print.DocFlavor;
import java.rmi.StubNotFoundException;
import java.util.*;
import java.util.function.Predicate;

import static org.example.functionalprogramming.model.InitStudents.NAMES_LIST;
import static org.example.functionalprogramming.model.InitStudents.STUDENT_LIST;

public class MyComparator {

    public static List<String> sortByCollections() {
        /*Not Sorted*/
        List<String> sortedList = Arrays.asList(NAMES_LIST);

        /*Sorted*/
        Collections.sort(sortedList);
        return sortedList;
    }

    /*SORT STUDENTS BY THEIR AGE*/
    public static List<Student> sortByComparator() {
        Comparator<Student> studentComparator = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
                //return Integer.compare(o1.getAge(),o2.getAge());
            }

        };
        List<Student> studentList = new ArrayList<>(STUDENT_LIST);
        Collections.sort(studentList, studentComparator);
        return studentList;
    }

    public static void main(String[] args) {
        System.out.println("SORT BY COLLECTION");
        System.out.println(sortByCollections());

        System.out.println("SORT BY COMPARATOR");
        sortByComparator().forEach((student) -> {
                    System.out.print("Name : " + student.getName());
                    System.out.println(" Age : " + student.getAge());
                }
        );
    }

}
