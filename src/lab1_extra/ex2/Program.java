package lab1_extra.ex2;

import java.util.ArrayList;
import java.util.List;

public class Program {
	private String name;
	private List<Course> courses;
	
	public Program(String name) {
		courses = new ArrayList<Course>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}

	@Override
	public String toString() {
		return getName();
	}

}
