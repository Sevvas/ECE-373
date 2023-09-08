package edu.ece373.hw1;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    
    public Department(){
    	departmentName = "unknown";
    	
    	
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setDepartment(this);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setDepartment(this);
    }

    public ArrayList<Course> getCourses() {
        return courses;
		
	}
}
