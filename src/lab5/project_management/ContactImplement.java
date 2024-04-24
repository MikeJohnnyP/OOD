package lab5.project_management;

public class ContactImplement implements Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String projectName;
    private String organization;

    public ContactImplement(String firstName, String lastName, String email, String projectName, String organization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.projectName = projectName;
        this.organization = organization;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getProjectName() {
        return projectName;
    }

    @Override
    public String getOrganization() {
        return organization;
    }

    @Override
    public void setFString(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLString(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "ContactImplement{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", projectName='" + projectName + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }

}
