package org.example.functionalprogramming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Students {
    String name;
    String grade;
    int age;

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Students{" + "name='" + name + '\'' + ", grade='" + grade + '\'' + ", age=" + age + '}';
    }
}


public class Streams {
    private final static List<Students> studentsList = List.of(new Students("NARUTO", "G", 16), new Students("SASUKE", "G", 16), new Students("SAKURA", "F", 16), new Students("MINATO", "H", 30), new Students("MADARA", "U", 50), new Students("OBITO", "U", 22));


    public static void streamFilter() {
        Predicate<Students> filterByGrade = student -> student.getGrade().equals("H");
        Stream<Students> stream = studentsList.stream().filter(filterByGrade);
        stream.forEach(s -> System.out.println(s.toString()));
    }

    private static void streamCount() {
        /*int count = studentsList.size();*/
        Long count = studentsList.stream().count();
        System.out.println("Count : " + count);
    }

    private static void streamsInArrays() {
        String names[] = {"NARUTO", "SASUKE", "SAKURA", "MADARA", "KAKASHI", "OBITO"};
        List<String> nameStream = Arrays.stream(names).collect(Collectors.toList());
        System.out.println("streamsInArrays : " + nameStream);

    }

    private static void streamMap() {
        Predicate<Students> filterByName = students -> students.getName().equalsIgnoreCase("naruto");
        List<Students> newStudentsList = studentsList.stream()
                .map(students ->
                        {
                            return new Students(students.getName(), students.getGrade(), students.getAge() + 10);
                        }
                )
                .collect(Collectors.toList());
        System.out.println("StreamMap");
        newStudentsList.stream()
                .filter(filterByName)
                .forEach(s ->
                        {
                            System.out.println("name : " + s.getName());
                            System.out.println("grade : " + s.getGrade());
                            System.out.println("age : " + s.getAge());
                        }
                );
    }

    public static void main(String[] args) {
        /*STREAMS*/
        /*to process a collection of data in a declarative (functional) way */

        /*filter*/
        streamFilter();

        /*count*/
        streamCount();

        /*stream in Arrays*/
        streamsInArrays();

        /*map*/
        streamMap();

        /*flatMap*/
        
    }


}