package lab1_extra.ex1;

import java.util.Date;

public class Author {
	private String name;
	private String nationality;
	private Date birthYear;

	public Author(String name, String nationality, Date birthYear) {
		this.name = name;
		this.nationality = nationality;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Date birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Tac gia: " + name + ", que quan: " + nationality + ", Ngay sinh: " + birthYear + '\n';
	}

}
