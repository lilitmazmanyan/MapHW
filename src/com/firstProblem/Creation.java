package com.firstProblem;

import java.util.*;

public class Creation {
    static HashMap<Student, Integer> studentMap = new HashMap<>();

    static HashMap<Student, Integer> putStudentsInMapAndCountNameOccurrances(ArrayList<Student> studentList) {
        for (Student s : studentList) {
            Integer count = studentMap.get(s);
            if (count == null) {
                studentMap.put(s, 1);
            } else
                studentMap.put(s, ++count);
        }
        return studentMap;
    }

    static ArrayList<Student> createStudentsAndAddThemToStudentsList() {
        Student s1 = null;
        Student s2 = null;
        Student s3 = null;
        Student s4 = null;
        Student s5 = null;
        Student s6 = null;
        Student s7 = null;
        Student s8 = null;

        try {
            s1 = new Student("Griogor", "Artazyan", 43, Faculties.MANAGEMENT);
            s7 = new Student("Griogor", "Artazyan", 5, Faculties.IAM);
            s2 = new Student("Anahit", "Sirekanyan", 30, Faculties.PHYSICS);
            s3 = new Student("Anahit", "Sirekanyan", 2, Faculties.PHYSICS);
            s4 = new Student("Anahit", "Sirekanyan", 20, Faculties.IAM);
            s5 = new Student("Susanna", "Palamutyan", 31, Faculties.MANAGEMENT);
            s6 = new Student("Manuk", "Vardanyan", 33, Faculties.IAM);
            s8 = new Student("Vardansuh", "Petrosyan", 24, Faculties.IAM);

        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);
        studentList.add(s8);

        return studentList;
    }

    static int countStudentsOfFaculty(ArrayList<Student> studentsList, Faculties fac) {
        int count = 0;
        for (Student s : studentsList) {
            if (s.getFaculty() == fac) {
                count++;
            }
        }
        return count;
    }

}
