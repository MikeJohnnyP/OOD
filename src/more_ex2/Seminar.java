package more_ex2;

public class Seminar extends Course {

    @Override
    public void conductSession() {
        System.out.println("Start 9:00");
    }

    @Override
    public void gradeStudent() {
        System.out.println("Grade 9th");
    }

    @Override
    public void nameCourse() {
        System.out.println("Essential Math");
    }

}
