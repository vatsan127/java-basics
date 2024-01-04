package org.example.functionalprogramming.model;

public class Student {
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

    public Student(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Students{" + "name='" + name + '\'' + ", grade='" + grade + '\'' + ", age=" + age + '}';
    }

}