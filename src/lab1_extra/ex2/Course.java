package lab1_extra.ex2;

public class Course {
	
	private String name;
	private String code;
	private int creditsHours;
	private int grade;

	public Course(String code, String name, int creditsHours) {
		this.name = name;
		this.code = code;
		this.creditsHours = creditsHours;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCreditsHours() {
		return creditsHours;
	}
	public void setCreditsHours(int creditsHours) {
		this.creditsHours = creditsHours;
	}
	@Override
	public String toString() {
		return getName() + "\t" + getCode() + "\t" 
				+ getCreditsHours() + "\t" + getGrade();
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

}
