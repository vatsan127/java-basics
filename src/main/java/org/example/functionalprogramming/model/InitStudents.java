package org.example.functionalprogramming.model;

import java.util.List;

public class InitStudents {

    public static final List<Student> STUDENT_LIST;
    public static final String NAMES_LIST[] =
            {"NARUTO", "SASUKE", "SAKURA", "MADARA", "KAKASHI", "OBITO"};

    static {
        STUDENT_LIST = List.of(
                new Student("SASUKE", "G", 15),
                new Student("SAKURA", "F", 11),
                new Student("MINATO", "H", 30),
                new Student("HASHIRAMA", "H", 60),
                new Student("MADARA", "U", 50),
                new Student("OBITO", "U", 22),
                new Student("NARUTO", "G", 16));
    }
}
