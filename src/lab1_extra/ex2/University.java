package lab1_extra.ex2;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {

	private List<Program> programs;
	private List<Course> courses;
	private List<Student> studentsList;

	public University() {
		programs = new ArrayList<Program>();
		courses = new ArrayList<Course>();
		studentsList = new ArrayList<Student>();
		init();
	}

	public void init() {

		Program program1 = new Program("Khoa hoc may tinh");
		Program program2 = new Program("Ky thuat");
		Program program3 = new Program("Kinh te");
		Program program4 = new Program("Ngon ngu");
		Program program5 = new Program("Toan");
		Program program6 = new Program("Van Hoc");
		Program program7 = new Program("Lich su");
		Program program8 = new Program("Quan Ly");
		Program program9 = new Program("Suc Khoe");
		Program program10 = new Program("Nghe Thuat");

		this.addProgram(program1);
		this.addProgram(program2);
		this.addProgram(program3);
		this.addProgram(program4);
		this.addProgram(program5);
		this.addProgram(program6);
		this.addProgram(program7);
		this.addProgram(program8);
		this.addProgram(program9);
		this.addProgram(program10);

		Course course1 = new Course("CS101", "Introduction to Computer Science", 3);
		Course course2 = new Course("ENG101", "Introduction to Engineering", 4);
		Course course3 = new Course("ECO101", "Introduction to Economics", 3);
		Course course4 = new Course("LAN101", "Introduction to Linguistics", 4);
		Course course5 = new Course("MAT101", "Introduction to Mathematics", 3);
		Course course6 = new Course("LIT101", "Introduction to Literature", 4);
		Course course7 = new Course("HIS101", "Introduction to History", 3);
		Course course8 = new Course("MGT101", "Introduction to Management", 4);
		Course course9 = new Course("HPE101", "Introduction to Health and Physical Education", 2);
		Course course10 = new Course("ART101", "Introduction to Art", 3);

		addCourse(course1);
		addCourse(course2);
		addCourse(course3);
		addCourse(course4);
		addCourse(course5);
		addCourse(course6);
		addCourse(course7);
		addCourse(course8);
		addCourse(course9);
		addCourse(course10);

		program1.addCourse(course1);
		program2.addCourse(course2);
		program3.addCourse(course3);
		program4.addCourse(course4);
		program5.addCourse(course5);
		program6.addCourse(course6);
		program7.addCourse(course7);
		program8.addCourse(course8);
		program9.addCourse(course9);
		program10.addCourse(course10);

		Student student1 = new Student("Nguyen Van A", "SV001", "nguyenvana@example.com");
		Student student2 = new Student("Tran Thi B", "SV002", "tranthib@example.com");
		Student student3 = new Student("Le Van C", "SV003", "levanc@example.com");
		Student student4 = new Student("Pham Thi D", "SV004", "phamthid@example.com");
		Student student5 = new Student("Hoang Van E", "SV005", "hoangvane@example.com");
		Student student6 = new Student("Mai Thi F", "SV006", "maithif@example.com");
		Student student7 = new Student("Đo Van G", "SV007", "dovang@example.com");
		Student student8 = new Student("Vu Thi H", "SV008", "vuthih@example.com");
		Student student9 = new Student("Nguyen Thanh I", "SV009", "nguyenthanhi@example.com");
		Student student10 = new Student("Tran Van K", "SV010", "tranvank@example.com");

		student1.enrollInProgram(program1);
		student2.enrollInProgram(program1);
		student3.enrollInProgram(program2);
		student4.enrollInProgram(program2);
		student5.enrollInProgram(program1);
		student6.enrollInProgram(program1);
		student7.enrollInProgram(program1);
		student8.enrollInProgram(program2);
		student9.enrollInProgram(program2);
		student10.enrollInProgram(program2);

		student1.enrollInCourse(course1);
		student2.enrollInCourse(course2);
		student3.enrollInCourse(course3);
		student4.enrollInCourse(course4);
		student5.enrollInCourse(course5);
		student6.enrollInCourse(course6);
		student7.enrollInCourse(course7);
		student8.enrollInCourse(course8);
		student9.enrollInCourse(course9);
		student10.enrollInCourse(course10);

		student1.enterGrades("CS101", 85);
		student2.enterGrades("ENG101", 75);
		student3.enterGrades("ECO101", 90);
		student4.enterGrades("LAN101", 80);
		student5.enterGrades("MAT101", 95);
		student6.enterGrades("LIT101", 70);
		student7.enterGrades("HIS101", 88);
		student8.enterGrades("MGT101", 82);
		student9.enterGrades("HPE101", 79);
		student10.enterGrades("ART101", 87);

		addStudent(student1);
		addStudent(student2);
		addStudent(student3);
		addStudent(student4);
		addStudent(student5);
		addStudent(student6);
		addStudent(student7);
		addStudent(student8);
		addStudent(student9);
		addStudent(student10);

	}

	public void displayMenu() {
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.print("MENU\n" + "1.Enroll a student in a program.\n" + "2.Enroll a student in a course.\n"
				+ "3.Enter grades for a student.\n" + "4.Display student's transcript.\n" + "5.Exit.\n");
		System.out.println("-----------------------------------");
	}

	public void addProgram(Program program) {
		this.programs.add(program);
	}

	public void addStudent(Student student) {
		this.studentsList.add(student);
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}

	public boolean checkStudent(Student student) {
		for (Student s : studentsList) {
			if (s.getName().equalsIgnoreCase(student.getName())
					|| s.getStudentID().equalsIgnoreCase(student.getStudentID())) {
				return true;
			}
		}
		return false;
	}

	public void setProgramStudentInList(Student student, Program program) {
		for (Student s : studentsList) {
			if (s.getName().equalsIgnoreCase(student.getName())
					|| s.getStudentID().equalsIgnoreCase(student.getStudentID())) {
				s.enrollInProgram(program);
				break;
			}
		}
	}

	public void setProgramStudentInList(Student student, Course course) {
		for (Student s : studentsList) {
			if (s.getName().equalsIgnoreCase(student.getName())
					|| s.getStudentID().equalsIgnoreCase(student.getStudentID())) {
				s.enrollInCourse(course);
				;
				break;
			}
		}
	}
	
	public Student getStudentInList(Student student) {
		for (Student s : studentsList) {
			if (s.getName().equalsIgnoreCase(student.getName())
					|| s.getStudentID().equalsIgnoreCase(student.getStudentID())) {
				return s;
			}
		}
		return null;
	}

//	public Program getPrgram(String name) {
//		for(Program g : programs) {
//			if()
//		}
//	}

	public void enrollStudentInProgram() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ten SV: ");
		String studentName = sc.nextLine();
		System.out.println("Nhap MSSV: ");
		String studentID = sc.nextLine();
		Student temp = new Student(studentName, studentID, null);
		if (checkStudent(temp)) {
			System.out.println("Co Sv trong ds");
			for (int i = 0; i < programs.size(); i++) {
				System.out.println((i + 1) + ". " + programs.get(i));
			}
			System.out.println("----------------------------------------");
			System.out.println("Chon so thu tu chuong trinh muon dang ky: ");
			int x = sc.nextInt();
			if (x > programs.size() || x <= 0) {
				System.out.println("Khong co trong ds");
			} else {
				setProgramStudentInList(temp, programs.get(x - 1));
				System.out.println("Them thanh cong!!!");
			}
		}
	}

	public void enrollStudentInCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ten SV: ");
		String studentName = sc.nextLine();
		System.out.println("Nhap MSSV: ");
		String studentID = sc.nextLine();
		Student temp = new Student(studentName, studentID, null);
		if (checkStudent(temp)) {
			System.out.println("Co Sv trong ds");
			for (int i = 0; i < courses.size(); i++) {
				System.out.println((i + 1) + ". " + courses.get(i).getName());
			}
			System.out.println("----------------------------------------");
			System.out.println("Chon so thu tu mon hoc muon dang ky: ");
			int x = sc.nextInt();
			if (x > programs.size() || x <= 0) {
				System.out.println("Khong co trong ds");
			} else {
				setProgramStudentInList(temp, courses.get(x - 1));
				System.out.println("Them thanh cong!!!");
			}
		}
	}

	public void enterGradesForStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ten SV: ");
		String studentName = sc.nextLine();
		System.out.println("Nhap MSSV: ");
		String studentID = sc.nextLine();
		Student temp = new Student(studentName, studentID, null);
		if (checkStudent(temp)) {
			System.out.println("Co Sv trong ds");
			Student after = getStudentInList(temp);
			studentsList.remove(after);
			for(int i = 0; i< after.getCoursesEnrolled().size(); i++) {
				System.out.println((i + 1) + ". " + after.getCoursesEnrolled().get(i));
			}

				System.out.println("Chon mon hoc muon them diem: ");
				int order = sc.nextInt();
				
				if (order > after.getCoursesEnrolled().size() || order <= 0) {
					System.out.println("Khong co trong ds");
				} else {
					String courseCode = after.getCoursesEnrolled().get(order - 1).getCode();
					System.out.println("Ban chon: " + after.getCoursesEnrolled().get(order - 1).getName());
					System.out.println("Nhap diem de thay doi: ");
					int grade = sc.nextInt();
					after.enterGrades(courseCode, grade);
					addStudent(after);
					System.out.println("Them thanh cong!!!");
				}
			}
		}
	
	public void displayStudentTranscript() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ten SV: ");
		String studentName = sc.nextLine();
		System.out.println("Nhap MSSV: ");
		String studentID = sc.nextLine();
		Student temp = new Student(studentName, studentID, null);
		if (checkStudent(temp)) {
			Student after = getStudentInList(temp);
			after.displayTranscript();
		}
		else {
			System.out.println("Sv khong co trong ds");
		}
	}

	public static void main(String[] args) {
		University uni = new University();
		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		while (isRunning) {
			uni.displayMenu();
			System.out.print("Ban chon so: ");
			int yourChoice = sc.nextInt();
			switch (yourChoice) {
			case 1:
				uni.enrollStudentInProgram();
				break;
			case 2:
				uni.enrollStudentInCourse();
				break;
			case 3:
				uni.enterGradesForStudent();
				break;
			case 4:
				uni.displayStudentTranscript();
				break;
			case 5:
				isRunning = false;
				break;
			}

		}
	}

}
