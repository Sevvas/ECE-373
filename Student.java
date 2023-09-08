package edu.ece373.hw1;

import java.util.ArrayList;

public class Student {
    private String name;
    private Department department;
    private ArrayList<Course> courses = new ArrayList<>();
    
    public Student() {
		name = "unknown";
		department = new Department();
		
	}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
