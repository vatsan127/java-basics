package org.example.functionalprogramming.methodreference;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
    /*reference
     * ClassName::methodName
     * Instance::methodName
     *
     *for constructor
     * ClassName::New
     * */

    private static final List<Student> studentList = InitStudents.STUDENT_LIST;

    public static void methodReference() {
        /*print The students*/
        studentList.forEach(System.out::println);
        System.out.println();

        /*using Function*/
        /*Function<String,String> function = studentName -> studentName.toLowerCase();*/
        Function<String, String> function = String::toLowerCase;
        studentList.forEach(student -> System.out.print(function.apply(student.getName()) + " "));
        System.out.println("\n");

        /*Using Consumer*/
        Consumer<String> consumer = System.out::println;
        studentList.forEach(student -> consumer.accept(student.getName()));
    }

    public static void main(String[] args) {
        methodReference();
    }
}
