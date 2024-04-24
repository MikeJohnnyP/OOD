package lab5.project_management;

public class StatusProject extends ProjectDecorator {

    public StatusProject(ProjectType projectType, String status) {
        super(projectType);
    }

    @Override
    public Double getTimeRequired() {
        return super.getTimeRequired();
    }

    @Override
    public ProjectType getProjectType() {
        return super.getProjectType();
    }

    public void setStatus(String status) {
        super.setStatus(status);
    }

}
