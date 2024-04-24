package lab5.project_management;

public class DependingProject extends ProjectDecorator {
    public DependingProject(ProjectType projectType) {
        super(projectType);
    }

    @Override
    public Double getTimeRequired() {
        return super.getTimeRequired() + 1.0;
    }
}
