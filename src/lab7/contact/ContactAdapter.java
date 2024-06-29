package lab7.contact;

public class ContactAdapter implements Contact {
  private LienHe contact;

  public ContactAdapter() {
    this.contact = new LienHeImp();
  }

  @Override
  public String getFirstName() {
    return contact.tenDau();
  }

  @Override
  public String getLastName() {
    return contact.tenCuoi();
  }

  @Override
  public String getTitle() {
    return contact.tieuDe();
  }

  @Override
  public String getOrganization() {
    return contact.toChuc();
  }

  @Override
  public void setContact(LienHe newContact) {
    this.contact = newContact;
  }

  @Override
  public void setFirstName(String newFirstName) {
    this.contact.setTenDau(newFirstName);
  }

  @Override
  public void setLastName(String newLastName) {
    this.contact.setTenCuoi(newLastName);
  }

  @Override
  public void setTitle(String newTitle) {
    this.contact.setTieuDe(newTitle);
  }

  @Override
  public void setOrganization(String newOrganization) {
    this.contact.setToChuc(newOrganization);
  }

  @Override
  public String toString() {
    return "ContactAdapter [contact=" + contact + ", getFirstName()=" + getFirstName() + ", getLastName()="
        + getLastName() + ", getTitle()=" + getTitle() + ", getOrganization()=" + getOrganization() + ", getClass()="
        + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
  }

}
