package lab1_extra.ex1;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Library {
	private List<Member> libraryMember;
	private List<Book> books;

	public Library() {
		libraryMember = new ArrayList<Member>();
		books = new ArrayList<Book>();
		init();
	}

	public void init() {
		Author au1 = new Author("Nguyen Nhat Anh", "Binh Que", new GregorianCalendar(1979, 5, 7).getTime());
		Author au2 = new Author("Nguyen Phong Viet", "TP. Tuy Hoa", new GregorianCalendar(1980, 7, 18).getTime());
		Author au3 = new Author("Dale Carnegie", "US", new GregorianCalendar(1955, 11, 1).getTime());
		Author au4 = new Author("Paulo Coelho", "Rio de janeiro, Brazil", new GregorianCalendar(1947, 8, 24).getTime());
		Author au5 = new Author("Nguyen Duy Can", "My Tho", new GregorianCalendar(1907, 7, 15).getTime());

		Book book1 = new Book("Dac nhan tam", 432534343, 2013, au3);
		Book book2 = new Book("Quang ganh lo di", 234543543, 2015, au3);
		Book book3 = new Book("Nha gia kim", 54634524, 1998, au4);
		Book book4 = new Book("Cho toi xin mot ve di tuoi tho", 435654534, 2004, au1);
		Book book5 = new Book("Toi thay hoa vang tren co xanh", 546547453, 2001, au1);
		Book book6 = new Book("Toi tu hoc", 856434554, 1997, au5);
		Book book7 = new Book("Di qua thuong nho", 546547456, 2014, au2);
		Book book8 = new Book("Tu yeu den thuong", 654764535, 2014, au2);
		Book book9 = new Book("Chuyen hanh huong", 544745345, 1997, au4);
		Book book10 = new Book("Ngoai tinh", 543645436, 2014, au4);

		

		Member mem1 = new Member("Nguyen Nhat Tan", "45ed453", new ContactInformation("34234@mail.com", "098754352"));
		Member mem2 = new Member("Pham Tuan Kiet", "45id567", new ContactInformation("4564@yahoo.com", "087654342"));
		Member mem3 = new Member("Huynh Xuan Truong", "76id656", new ContactInformation("456@google.com", "067854343"));
		Member mem4 = new Member("Ho Hoai Huong", "65ed678",
				new ContactInformation("34564@st.hcmuaf.edu.vn", "08653452"));
		Member mem5 = new Member("Ta Viet Tien", "98id653", new ContactInformation("764@yahoo.com", "0974543643"));
		
		book1.setIsBorrowByName(true, mem4.getName());
		book3.setIsBorrowByName(true, mem1.getName());
		book3.setDurationBorrow(new GregorianCalendar(2024, 3, 15).getTime());
		book4.setIsBorrowByName(true, mem2.getName());
		book4.setDurationBorrow(new GregorianCalendar(2024, 3, 11).getTime());
		book5.setIsBorrowByName(true, mem3.getName());
		book6.setIsBorrowByName(true, mem2.getName());
		book7.setIsBorrowByName(true, mem5.getName() );
		book8.setIsBorrowByName(true, mem5.getName());

		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
		
		mem1.addBook(book3);
		mem2.addBook(book4);
		mem3.addBook(book5);
		mem4.addBook(book1);
		mem4.addBook(book6);
		mem5.addBook(book7);
		mem5.addBook(book8);

		libraryMember.add(mem1);
		libraryMember.add(mem2);
		libraryMember.add(mem3);
		libraryMember.add(mem4);
		libraryMember.add(mem5);

	}

	public void addLibraryMember(Member member) {
		if (!(libraryMember.isEmpty())) {
			libraryMember.add(member);
		}
		libraryMember.add(member);
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public boolean checkBook(Book book) {
		for (Book b : books) {
			if (b.getName().equalsIgnoreCase(book.getName()) || b.getISBN().equals(book.getISBN()))
				return true;
		}
		return false;
	}

	public boolean checkAvailable(Book book) {
		for (Book b : books) {
			if (b.getName().equalsIgnoreCase(book.getName()) || b.getISBN().equals(book.getISBN()))
				return b.getIsBorrow();
		}
		return false;
	}

	public Book getABook(Book book) {
		for (Book b : books) {
			if (b.getName().equalsIgnoreCase(book.getName()) || b.getISBN().equals(book.getISBN()))
				return b;
		}
		return null;
	}

	public Member getMemberReturnBook(Book book) {
		for (Member b : libraryMember) {
			if (b.isContainsBook(book)) {
				return b;
			}
		}
		return null;
	}

	public void refreshAvailable(Book book, String name) {
		for (Book b : books) {
			if (b.getName().equalsIgnoreCase(book.getName()) || b.getISBN().equals(book.getISBN()))
				b.setIsBorrowByName(book.getIsBorrow(), name);
		}
	}

	public void returnBook(Book book) {
		for (Book b : books) {
			if (b.getName().equalsIgnoreCase(book.getName()) || b.getISBN().equals(book.getISBN()))
				b.setIsBorrowByName(book.getIsBorrow(), null);
		}
	}

	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("--------------------------");
	}

	public void borrowABook() {
		System.out.print("Nhap ho va ten: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("Nhap ma thanh vien: ");
		String memberID = sc.nextLine();

		System.out.print("Tim kiem sach theo ten(1) va ISBN(2): ");
		int x = sc.nextInt();
		sc.nextLine();
		switch (x) {
		case 1:
			System.out.print("Nhap vao ten sach: ");
			String nameBook = sc.nextLine();
			Book b2 = new Book(nameBook, 0, 0, null);
			if (!checkBook(b2)) {
				System.out.println("Khong co sach nay!!!");
				break;
			}
			if (checkAvailable(b2)) {
				System.out.println("sach da duoc dat!!!");
				break;
			} else {
				Member temp = new Member(name, memberID, null);
				b2.setIsBorrowByName(true, temp.getName());
				refreshAvailable(b2, temp.getName());
				Book setBook = getABook(b2);
				setBook.setIsBorrowByName(true, temp.getName());
				temp.addBook(setBook);
				libraryMember.add(temp);
				System.out.println("Dat sach thanh cong");
				break;
			}

		case 2:
			System.out.print("Nhap vao ma ISBN: ");
			int ISBNcode = sc.nextInt();
			Book b3 = new Book(null, ISBNcode, 0, null);
			if (!checkBook(b3)) {
				System.out.println("Khong co sach nay!!!");
				break;
			}
			if (checkAvailable(b3)) {
				System.out.println("sach da duoc dat!!!");
				break;
			} else {
				Member temp = new Member(name, memberID, null);
				b3.setIsBorrowByName(true, temp.getName());
				refreshAvailable(b3, temp.getName());
				Book setBook = getABook(b3);
				setBook.setIsBorrowByName(true, temp.getName());
				temp.addBook(setBook);
				libraryMember.add(temp);
				System.out.println("Dat sach thanh cong");
				break;
			}
		default:
			System.out.println("Nhap sai!!!");
			break;
		}
	}

	public void returnABook(Library lb) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tim kiem sach theo ten(1) va ISBN(2): ");
		int x = sc.nextInt();
		sc.nextLine();
		switch (x) {
		case 1:
			System.out.print("Nhap vao ten sach: ");
			String nameBook = sc.nextLine();
			Book b2 = new Book(nameBook, 0, 0, null);
			if (!checkBook(b2)) {
				System.out.println("Khong co sach nay!!!");
				break;
			}
			if (checkAvailable(b2)) {
				Book tempBook = lb.getABook(b2);
				if (tempBook.getIsOverdue(new Date())) {
					System.out.println("Sach qua han gui, ban bi phat them 50.000vnd " + "le phi");

				}

				b2.setIsBorrowByName(false, null);
				refreshAvailable(b2, null);
				Member temp = lb.getMemberReturnBook(b2);
				lb.getLibraryMember().remove(temp);
				temp.removeBook(b2);
				libraryMember.add(temp);
				System.out.println("Gui lai thanh cong!!!");

				break;
			} else {
				System.out.println("Sach chua duoc dat!!!");
				break;
			}

		case 2:
			System.out.print("Nhap vao ma ISBN: ");
			int ISBN = sc.nextInt();
			Book b3 = new Book(null, ISBN, 0, null);
			if (!checkBook(b3)) {
				System.out.println("Khong co sach nay!!!");
				break;
			}
			if (checkAvailable(b3)) {
				Book tempBook = lb.getABook(b3);
				if (tempBook.getIsOverdue(new Date())) {
					System.out.println("Sach qua han gui, ban bi phat them 50.000vnd " + "le phi");

				}

				b3.setIsBorrowByName(false, null);
				refreshAvailable(b3, null);
				Member temp = lb.getMemberReturnBook(b3);
				lb.getLibraryMember().remove(temp);
				temp.removeBook(b3);
				libraryMember.add(temp);
				System.out.println("Gui lai thanh cong!!!");

				break;
			} else {
				System.out.println("Sach chua duoc dat!!!");
				break;
			}

		default:
			System.out.println("Nhap sai!!!");
			break;
		}
	}

	public void memberBorrowed() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten nguoi dat: ");
		String name = sc.nextLine();
		
		for (Member i : libraryMember) {
			if(i.getName().equalsIgnoreCase(name)) {
				for (Book b : i.getBorrowList()) {
					System.out.println("Nguoi dat: " + b.getBorrower() + "\tSach: "+ b.getName());
				}
			}	
		}
			
	}
	private void overdueBook() {
		for(Member i : libraryMember) {
			for(Book b : i.getBorrowList()) {
				if(b.getIsOverdue(new Date())) {
					System.out.println(b);
				}
			}
		}
		
	}

	public void menu() {
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.print("MENU\n" + "1. Borrow a book.\n" + "2.return a book.\n" + "3.Display member Borrow Book.\n"
				+ "4.Display overdue book.\n" + "5.Exit.\n");
		System.out.println("-----------------------------------");
	}

	public List<Member> getLibraryMember() {
		return libraryMember;
	}

	public void setLibraryMember(List<Member> libraryMember) {
		this.libraryMember = libraryMember;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public static void main(String[] args) {
		Library lb = new Library();
		boolean isRunning = true;

		while (isRunning) {
			int youChoose = 0;
			lb.menu();
			System.out.print("Ban chon so: ");
			Scanner sc = new Scanner(System.in);
			youChoose = sc.nextInt();
			sc.nextLine();
			switch (youChoose) {
			case 1:
				lb.borrowABook();
				break;
			case 2:
				lb.returnABook(lb);
				break;
			case 3:
				lb.memberBorrowed();
				break;
			case 4: 
				lb.overdueBook();
				break;
			case 5:
				isRunning = false;
				break;
			default:
				System.out.println("Nhap sai!!!");
			}
		}
	}

	
}
