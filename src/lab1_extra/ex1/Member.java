package lab1_extra.ex1;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private String name;
	private String membershipID;
	private ContactInformation contactInformation;
	private List<Book> borrowList;

	public Member(String name, String membershipID, ContactInformation contactInformation) {
		borrowList = new ArrayList<Book>();
		this.name = name;
		this.membershipID = membershipID;
		this.contactInformation = contactInformation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMembershipID() {
		return membershipID;
	}

	public void setMembershipID(String membershipID) {
		this.membershipID = membershipID;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public void addBook(Book book) {
		if (book.getIsBorrow() == false)
			return;
		borrowList.add(book);
	}

	public boolean isContainsBook(Book book) {
		for (Book b : borrowList) {
			if (b.getName().equalsIgnoreCase(book.getName()) || b.getISBN() == book.getISBN()) {
				return true;
			}
		}
		return false;
	}

	public void removeBook(Book book) {
		for (Book b : borrowList) {
			if (b.getName().equalsIgnoreCase(book.getName()) || b.getISBN() == book.getISBN()) {
				borrowList.remove(b);
			}

		}
	}

	public List<Book> getBorrowList() {
		return borrowList;
	}

	public boolean isEmptyBorrowList() {
		return borrowList.isEmpty();
	}

	@Override
	public String toString() {
		return "Ten nguoi dat: " + name + ", memberID: " + membershipID + ", lien he: " + contactInformation + '\n';
	}

}
