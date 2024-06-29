package lab7.ex3;

public class ContactAdapterImpl implements Contact {
    private LienHe contact;

    public ContactAdapterImpl(LienHe contact) {
        this.contact = contact;
    }

    @Override
    public String getFirstName() {
        return contact.getHo();
    }

    @Override
    public String getLastName() {
        return contact.getTen();
    }

    @Override
    public String getTitle() {
        return contact.getChucVu();
    }

    @Override
    public String getOrganization() {
        return contact.getToChuc();
    }

    @Override
    public void setContact(LienHe contact) {
        this.contact = contact;
    }

    @Override
    public void setFirstName(String firstName) {
        this.contact.setHo(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        this.contact.setTen(lastName);
    }

    @Override
    public void setTitle(String title) {
        this.contact.setChucVu(title);
    }

    @Override
    public void setOrganization(String organization) {
        this.contact.setToChuc(organization);
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nOrganization: "
                + getOrganization() + "\nTitle: " + getTitle();
    }
}