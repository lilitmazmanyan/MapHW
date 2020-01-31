package com.student;

import java.util.*;

public class Creation {
    static HashMap<Student, Integer> studentMap = new HashMap<>();

    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = null;
        Student s3 = null;
        Student s4 = null;
        Student s5 = null;
        Student s6 = null;
        Student s7 = null;

        try {
            s1 = new Student("Griogor", "Artazyan", 43);
            s7 = new Student("Griogor", "Artazyan", 43);
            s2 = new Student("Anahit", "Sirekanyan", 20);
            s3 = new Student("Anahit", "Sirekanyan", 20);
            s4 = new Student("Anahit", "Sirekanyan", 20);
            s5 = new Student("Susanna", "Palamutyan", 31);
            s6 = new Student("Manuk", "Vardanyan", 33);


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

        for (Student s : studentList) {
            Integer count = studentMap.get(s);
            if (count == null) {
                studentMap.put(s, 1);
            } else
                studentMap.put(s, ++count);
        }

        System.out.println(studentMap);
    }

}
