package org.example.functionalprogramming.comparator;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    /*Operations
     * comparator in List.sort()
     * .thenCompare()
     * */
    private static final List<Student> studentList = InitStudents.STUDENT_LIST;

    public static void listSort() {
        /*sort students by name in student object List*/
        List<Student> temp = new ArrayList<>(studentList);
        Comparator<Student> nameCompare = Comparator.comparing(Student::getName);
        temp.sort(nameCompare);
        System.out.println("Sort by name : " +
                temp.stream()
                        .map(Student::getName)
                        .collect(Collectors.toList()));

        /*Sort students by age */
        List<Student> temp2 = new ArrayList<>(studentList);
        Comparator<Student> ageCompare = Comparator.comparingInt(Student::getAge);
        temp2.sort(ageCompare);
        System.out.println("Sort by Age : " +
                temp2.stream()
                        .map(Student::getName)
                        .collect(Collectors.toList()));

        /*Sort students by age and then by Name*/
        List<Student> temp3 = new ArrayList<>(studentList);
        temp3.sort(ageCompare.thenComparing(nameCompare));
        System.out.println("Sort by Age and then Name : " +
                temp3.stream()
                        .map(Student::getName)
                        .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        listSort();
    }
}
