package lab1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	private String name;
	private Date dateOfBirth;
	private Lecturer assistant;
	private List<Register> courseRegisters;

	public Student(String name, Date dateOfBirth) {
		courseRegisters = new ArrayList<Register>();
		this.name = name;
		this.dateOfBirth = dateOfBirth;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Lecturer getAssistant() {
		return assistant;
	}

	public void setAssistant(Lecturer assistant) {
		this.assistant = assistant;
	}

	public List<Register> getCourseRegisters() {
		return courseRegisters;
	}

	public void setcourseRegisters(List<Register> courseRegisters) {
		this.courseRegisters = courseRegisters;
	}

	public void register(Course c) {
		courseRegisters.add(new Register(c));

	}

	public void updateGrade(Course c, float grade) {
		if (!(courseRegisters.isEmpty())) {
			for (Register e : courseRegisters) {
				if (e.getCourse().getName().equals(c.getName())) {
					e.setGrade(grade);
					break;
				}
			}
		}
		return;
	}

	public float averageOfGrade() {
		float sum = 0;
		float sumOfCredits = getSumOfCredits();
		for (Register e : courseRegisters) {
			sum += (e.getGrade() * e.getCourse().getCredits()) / sumOfCredits;
		}
		return sum;
	}

	public float getSumOfCredits() {
		float sumOfCredits = 0;
		for (Register e : courseRegisters) {
			sumOfCredits += e.getCourse().getCredits();
		}
		return sumOfCredits;

	}

	public String rank() {
		float average = averageOfGrade();
		if (!(average < 5)) {
			if (average >= 9)
				return "XUAT SAC";
			else if (average >= 8)
				return "GIOI";
			else if (average >= 7)
				return "KHA";
			else if (average >= 6)
				return "TRUNG BINH KHA";
			else
				return "TRUNG BINH";

		}
		return "ROT";
	}

	public void printGradeReport() {
		System.out.println("Name: " + getName());
		System.out.println("Ngay Sinh: " + getDateOfBirth());
		System.out.println("STT\tMon\tDiem");
		for (int i = 0; i < courseRegisters.size(); i++) {
			System.out.println(
					i + "\t" + courseRegisters.get(i).getCourse().getName() + "\t" + courseRegisters.get(i).getGrade());
		}
		System.out.println("Diem TB: " + averageOfGrade());
		System.out.println("Xep loai: " + rank());
		System.out.println("----------------------------------------");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", dateOfBirth=" + dateOfBirth + ", assistant=" + assistant
				+ ", courseRegisters=" + courseRegisters + "]";
	}
}
