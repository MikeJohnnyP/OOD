package lab5.project_management;

public class Deliverable implements ProjectType {
    private String name;
    private String description;
    private Double timeRequired;
    private String status;
    private Contact contact;

    public Deliverable(String name, String description, Double timeRequired, String status, Contact contact) {
        this.name = name;
        this.description = description;
        this.timeRequired = timeRequired;
        this.status = status;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public ProjectType getProjectType() {
        return null;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public void setProjectType(ProjectType projectType) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTimeRequired(Double timeRequired) {
        this.timeRequired = timeRequired;
    }

    @Override
    public Double getTimeRequired() {
        return this.timeRequired;
    }

}
