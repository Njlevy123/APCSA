/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.course21;

/**
 *
 * @author nlevy2025
 */
import java.util.Scanner;

public class Course21 {

    // Course21 Class
    public static class Course {
        private String name;
        private int testScore;

        // Constructor
        public Course(String name) {
            this.name = name;
            this.testScore = 0; // Default score is 0
        }

        // Set the test score
        public void setTestScore(int score) {
            this.testScore = score;
        }

        // Get the test score
        public int getTestScore() {
            return this.testScore;
        }

        // Get the name of the course
        public String getName() {
            return this.name;
        }

        // String of the course
        public String toString() {
            return name + ": " + testScore;
        }
    }

    // Student Class
    public static class Student {
        private String name;
        private Course[] courses;

        // Constructor with student name and courses
        public Student(String name, Course course1, Course course2, Course course3) {
            this.name = name;
            this.courses = new Course[]{course1, course2, course3};
        }

        // Set the test score for a specific course
        public void setTestScore(int courseIndex, int score) {
            if (courseIndex >= 0 && courseIndex < 3) {
                courses[courseIndex].setTestScore(score);
            } else {
                System.out.println("Invalid course index.");
            }
        }

        // Get the test score for a specific course
        public int getTestScore(int courseIndex) {
            if (courseIndex >= 0 && courseIndex < 3) {
                return courses[courseIndex].getTestScore();
            } else {
                System.out.println("Invalid course index.");
                return -1;
            }
        }

        // Get the average test score
        public double getAverage() {
            int total = 0;
            for (int i = 0; i < 3; i++) {
                total += courses[i].getTestScore();
            }
            return total / 3.0;
        }

        // String representation of the student
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Student Name: ").append(name).append("\n");
            for (Course course : courses) {
                sb.append(course.toString()).append("\n");
            }
            return sb.toString();
        }
    }

    // Driver Class
    public static void main(String[] args) {
        // Create some courses
        Course course1 = new Course("Math");
        Course course2 = new Course("English");
        Course course3 = new Course("Science");

        // Create a student with these courses
        Student student = new Student("Noah Levy", course1, course2, course3);

        // Create a scanner 
        Scanner scanner = new Scanner(System.in);

        // Get test scores from the user
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter test score for " + student.getTestScore(i) + " (" + 
                               student.name + " - " + student.courses[i].getName() + "):");
            int score = scanner.nextInt();
            student.setTestScore(i, score);
        }

        // Output the student's details
        System.out.println(student.toString());

        // Output the average score
        System.out.println("Average Score: " + student.getAverage());
    }
}
