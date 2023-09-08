package edu.ece373.hw1;

import java.util.ArrayList;

import edu.ece373.hw1.Course;
import edu.ece373.hw1.Department;
import edu.ece373.hw1.Student;

public class University {
	

	
	
	//create set/get for these
	//Student
	//Department
	//Course
	//University
	private Student student;
	private String departmentName;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    public ArrayList<Department> departmentList = new ArrayList<>();
    private String name;
    private Department department;

    

	
	
	// constructors.... what do for array lists 
	public University() {
		student = new Student();
		department = new Department();
		
		
		}
		
		
		//private ArrayList<Course> courses = new ArrayList<>();



	    public void setDepartmentName(String departmentName) {
	        this.departmentName = departmentName;
	    }

	    public String getDepartmentName() {
	        return departmentName;
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	       // student.setDepartment(this);
	    }

	    public ArrayList<Student> getStudents() {
	        return students;
	    }

	    public void addCourse(Course course) {
	        courses.add(course);
	     //   course.setDepartment(this);
	    }

	    public ArrayList<Course> getCourses() {
	        return courses;
	    }
	    
	    public void addDepartmentList(Department department) {
	    	departmentList.add(department);
	  //      department.setDepartmentList(this);
	    }


		public void printDepartmentList() {
			// TODO Auto-generated method stub
			
		}


		public void printStudentList() {
			// TODO Auto-generated method stub
			
		}


		public void printCourseList() {
			// TODO Auto-generated method stub
			
		}
	}
