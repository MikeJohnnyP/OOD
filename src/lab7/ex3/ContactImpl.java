package lab7.ex3;

public class ContactImpl implements Contact {
    private String firstName, lastName, organization, title;

    public ContactImpl(String firstName, String lastName, String organization, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;
        this.title = title;
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
    public String getTitle() {
        return title;
    }

    @Override
    public String getOrganization() {
        return organization;
    }

    @Override
    public void setContact(LienHe contact) {

    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nOrganization: "
                + getOrganization() + "\nTitle: " + getTitle();
    }

}
