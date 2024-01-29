package org.example.functionalprogramming.supplier;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MySupplier {

    /*
     * Supplier
     * takes no argument
     * but returns data
     * (opposite of Consumer)
     * */

    private static List<Student> studentList = InitStudents.STUDENT_LIST;

    public static void supplier() {
        List<String> nameList = new ArrayList<>();
        Function<String, String> function = String::toLowerCase;
        Supplier<List<String>> supplier = () ->
        {
            studentList.forEach(s ->
            {
                String name = function.apply(s.getName());
                nameList.add(name);
            });
            return nameList;
        };
        System.out.println("NameList : " + supplier.get());
    }

    public static void main(String[] args) {
        supplier();
    }
}
