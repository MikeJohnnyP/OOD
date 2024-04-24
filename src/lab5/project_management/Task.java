package lab5.project_management;

public class Task implements ProjectType {
    private String name;
    private Double timeRequired;
    private String status;
    private ProjectType projectType;
    private Contact contact;

    public Task(String name, Double timeRequired, String status, ProjectType projectType) {
        this.name = name;
        this.timeRequired = timeRequired;
        this.status = status;
        this.projectType = projectType;
    }

    public String getName() {
        return name;
    }

    @Override
    public Double getTimeRequired() {
        return projectType.getTimeRequired() + this.timeRequired;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public ProjectType getProjectType() {
        return projectType;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeRequired(Double timeRequired) {
        this.timeRequired = timeRequired;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public String toString() {
        return "Task: " + name + " Time Required: " + getTimeRequired() + " Status: " + status + " Project Type: "
                + projectType;
    }
}
