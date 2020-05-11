package com.lab7;

import com.lab7.print.P;
import com.lab7.student.Student;
import com.lab7.util.Utils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(0, "Artem", "Meniak", "KB-71"));
        students.add(new Student(1, "Max", "Basow", "KB-71"));
        students.add(new Student(2, "Daria", "Kozlova", "KB-71"));
        students.add(new Student(3, "Ehor", "Shum", "KB-71"));
        students.add(new Student(4, "Ivan", "Ivanov", "IN-71"));

        for (Student student : students) {
            P.rint(student.toString());
        }

        P.rint("\n\nThe best subject is: " + Utils.getTheBestSubject(students));

    }
}
