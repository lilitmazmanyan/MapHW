package com.firstProblem;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList =
                Creation.createStudentsAndAddThemToStudentsList();

        HashMap<Student, Integer> studentMap =
                Creation.putStudentsInMapAndCountNameOccurrances(studentList);

        int studentsInOneFac = Creation.countStudentsOfFaculty(studentList, Faculties.IAM);
        System.out.println(studentsInOneFac);

        System.out.println(studentMap);

    }

}
