package lab5.project_management;

public class ProjectDecorator implements ProjectType {

    private ProjectType projectType;

    public ProjectDecorator(ProjectType projectType) {
        this.projectType = projectType;
    }

    @Override
    public Double getTimeRequired() {
        return projectType.getTimeRequired();
    }

    @Override
    public ProjectType getProjectType() {
        return projectType;
    }

    @Override
    public void setStatus(String status) {
        projectType.setStatus(status);
    }

    @Override
    public String getStatus() {
        return projectType.getStatus();
    }

}
