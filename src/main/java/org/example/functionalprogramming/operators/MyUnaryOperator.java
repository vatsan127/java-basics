package org.example.functionalprogramming.operators;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.List;
import java.util.function.UnaryOperator;

public class MyUnaryOperator {
    /*Used when the input and output is of same Type*/

    private static final List<Student> studentList = InitStudents.STUDENT_LIST;

    public static void unaryOperator() {
        UnaryOperator<Integer> unaryOperatorForAgePlus5 = studentAge -> studentAge + 5;
        studentList.forEach(
                s -> {
                    int result = unaryOperatorForAgePlus5.apply(s.getAge());
                    System.out.print(result + " ");
                }
        );
    }

    public static void main(String[] args) {
        unaryOperator();
    }
}
