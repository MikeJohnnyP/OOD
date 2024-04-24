package lab5.project_management;

public interface Contact {
    public String getFirstName();

    public String getLastName();

    public String getEmail();

    public String getProjectName();

    public String getOrganization();

    public void setFString(String firstName);

    public void setLString(String lastName);

    public void setEmail(String email);

    public void setProjectName(String projectName);

    public String toString();
}
