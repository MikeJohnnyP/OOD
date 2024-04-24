package lab5.project_management;

public class TestProjectManagement {

    public static void main(String[] args) {
        ProjectType project = new Deliverable("dfsd", "on works", 2.0, "In Progress", null);
        ProjectType DependingProject = new DependingProject(project);
        ProjectType statusProject = new StatusProject(project, null);

        System.out.println("Project Name: " +
                DependingProject.getProjectType().getProjectType());
        System.out.println("Time Required: " + DependingProject.getTimeRequired());
        System.out.println("Status: " + DependingProject.getStatus());

        System.out.println("Project Name: " +
                statusProject.getProjectType().getProjectType());
        System.out.println("Time Required: " + statusProject.getTimeRequired());
        System.out.println("Status: " + statusProject.getStatus());
    }

}
