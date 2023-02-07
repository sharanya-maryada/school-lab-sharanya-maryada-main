package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School {

    public void demo() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("H", 23, 4, 3.40));
        students.add(new Student("Sak", 26, 66, 3.00));
        students.add(new Student("Jin", 30, 2, 3.02));
        students.add(new Student("Kit", 21, 55, 2.98));

        // Sort students by name
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println("\nSorted by name:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + " | Age: " + s.age + " | Id: " + s.id + " | Grade: " + s.grade);
        }
        System.out.println("\n");

        // Sort students by age
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.age - s2.age;
            }
        });
        System.out.println("Sorted by age:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + " | Age: " + s.age + " | Id: " + s.id + " | Grade: " + s.grade);
        }
        System.out.println("\n");

        // Sort students by id
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.id - s2.id;
            }
        });
        System.out.println("Sorted by id:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + " | Age: " + s.age + " | Id: " + s.id + " | Grade: " + s.grade);
        }
        System.out.println("\n");

        // Sort students by grade
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.grade, s2.grade);
            }
        });
        System.out.println("Sorted by grade:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + " | Age: " + s.age+" | Id: " + s.id+" | Grade: "+ s.grade );
        }
        System.out.println("\n");

    }
}

