package Opgave1;

import java.util.ArrayList;
public class Student {

    private String name;
    private int age;
    private static ArrayList<Student> students = new ArrayList<>();
    private static int ID = 0;
    private static int studentID;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        ID++;
        students.add(this);
    }

    void printInfo(){
        System.out.println("Student name: "+name+" Student age: "+age+" Student ID: "+studentID);
    }

}


