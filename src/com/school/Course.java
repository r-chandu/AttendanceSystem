package com.school;

public class Course {
    private static int nextCourseIdCounter = 101;

    int courseId;
    String courseName;

// Constructor
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}
