package lab1_extra.ex2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String studentID;
	private String email;
	private List<Program> programsEnrolled;
	private List<Course> coursesEnrolled;

	public Student(String name, String studentID, String email) {
		programsEnrolled = new ArrayList<Program>();
		coursesEnrolled = new ArrayList<Course>();
		this.name = name;
		this.studentID = studentID;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Program> getProgramsEnrolled() {
		return programsEnrolled;
	}

	public void setProgramsEnrolled(List<Program> programsEnrolled) {
		this.programsEnrolled = programsEnrolled;
	}

	public List<Course> getCoursesEnrolled() {
		return coursesEnrolled;
	}

	public void setCoursesEnrolled(List<Course> coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}

	public void enrollInProgram(Program program) {
		if (!(programsEnrolled.contains(program))) {
			programsEnrolled.add(program);
			return;
		}
		return;
	}

	public void enrollInCourse(Course course) {
		if (!(coursesEnrolled.contains(course))) {
			coursesEnrolled.add(course);
			return;
		}
		return;
	}

	public void enterGrades(String courseCode, int grade) {
		for (Course c : coursesEnrolled) {
			if (c.getCode().equalsIgnoreCase(courseCode)) {
				c.setGrade(grade);
				return;
			}
		}
	}

	public void displayTranscript() {
		System.out.println("Ho va ten: " + getName());
		System.out.println("MSSV: " + getStudentID());
		System.out.println("Ten mon hoc\tMa mon hoc\tSo tin chi\tDiem");
		for (Course c : coursesEnrolled) {
			System.out.println(c);
		}
		System.out.println("----------------------------------------");

	}
}
