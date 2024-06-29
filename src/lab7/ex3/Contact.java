package lab7.ex3;

public interface Contact {
    public String getFirstName();

    public String getLastName();

    public String getTitle();

    public String getOrganization();

    public void setContact(LienHe contact);

    public void setFirstName(String firstName);

    public void setLastName(String lastName);

    public void setTitle(String title);

    public void setOrganization(String organization);
}