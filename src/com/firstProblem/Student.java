package com.firstProblem;

import java.util.Objects;

public class Student {
    String firstName;
    String lastName;
    int age;
    Enum faculty;

    public Enum getFaculty() {
        return faculty;
    }

    Student(String firstName, String lastName, int age, Faculties faculty) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        if (age > 0 && age < 100)
            this.age = age;
        else throw new Exception("Age of " + this.firstName + " " + this.lastName + " is invalid");
        this.faculty = faculty;
    }


    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " ";    // + " " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}