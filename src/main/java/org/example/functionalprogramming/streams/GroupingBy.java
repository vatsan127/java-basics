package org.example.functionalprogramming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.example.functionalprogramming.model.InitStudents;
import org.example.functionalprogramming.model.Student;

public class GroupingBy {
    private static List<Student> studentList = InitStudents.STUDENT_LIST;

    public static void main(String[] args) {
	List<String> nameList = new  ArrayList<String>();
	nameList = studentList.stream()
		.map(Student::getName)
		.toList();
	System.out.println(nameList);
	
	Map<String , Long> map =  nameList.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	for(Map.Entry<String, Long> entry : map.entrySet()) {
	    System.out.print("Key : "+entry.getKey() +"  Value : "+entry.getValue());
	    System.out.println();
	}
	
    }
}
