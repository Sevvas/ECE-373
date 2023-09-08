package edu.ece373.hw1;
import java.util.ArrayList;

public class Course {
    private String name;
    private int courseNumber;
    private Department department;
    private ArrayList<Student> studentRoster = new ArrayList<>();
    private ArrayList<Integer> schedule = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void addStudent(Student student) {
        studentRoster.add(student);
    }

    public ArrayList<Student> getStudentRoster() {
        return studentRoster;
    }

    public void setSchedule(int scheduleNumber) {
        schedule.add(scheduleNumber);
    }

    public ArrayList<Integer> getSchedule() {
        return schedule;
    }
}
