package more_lab9_2;

public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        Employee employee = new Employee();
        department.add(employee);
        department.display();

        
        Department department2 = new Department();
        Employee employee2 = new Employee();
        department2.add(employee2);
        department.add(department2);
        department.display();

    }
}
