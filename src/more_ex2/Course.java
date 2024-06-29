package more_ex2;

public abstract class Course {

    public void start() {
        nameCourse();
        conductSession();
        gradeStudent();
    }

    public abstract void nameCourse();

    public abstract void conductSession();

    public abstract void gradeStudent();

}
