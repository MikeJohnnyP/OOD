package lab1_extra.ex1;

import java.util.Calendar;
import java.util.Date;

public class Book {
	private String name;
	private Integer ISBN;
	private int publicationYear;
	private Author author;
	private String borrower;
	private boolean isBorrow;
	private Date durationBorrow;
	
	public Book(String name, int ISBN, int publicationYear, Author author) {
		this.name = name;
		this.ISBN = ISBN;
		this.publicationYear = publicationYear;
		this.author = author;
		isBorrow = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public void setIsBorrowByName(boolean isBorrow, String name) {
		this.isBorrow = isBorrow;
		if(isBorrow == true && name != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			calendar.add(Calendar.DAY_OF_MONTH, 3);
			durationBorrow = calendar.getTime();
			this.borrower = name;
		} else {
			durationBorrow = null; 
			borrower = null;
		}
	}
	
	public void setIsBorrow(boolean isBorrow) {
	this.isBorrow = isBorrow;
		if(isBorrow == true) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			calendar.add(Calendar.DAY_OF_MONTH, 3);
			durationBorrow = calendar.getTime();
		} else {
			durationBorrow = null;
		}
	}
	
	
	
	public boolean getIsOverdue(Date date) {
		try {
			Calendar c = Calendar.getInstance();
			c.setTime(getDurationBorrow());
			Calendar b = Calendar.getInstance();
			b.setTime(date);
			int bookTime = c.get(Calendar.DAY_OF_MONTH);
			int curentTime = b.get(Calendar.DAY_OF_MONTH);
			if(curentTime > bookTime) {
				return true;
			} else return false;
		
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		}
		
	
	public boolean getIsBorrow() {
		return isBorrow;
	}

	public Date getDurationBorrow() {
		return this.durationBorrow;
	}

	public void setDurationBorrow(Date durationBorrow) {
		this.durationBorrow = durationBorrow;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Ten sach: " + name + " ,ISBN: " + ISBN + ", nam phat hanh: " + publicationYear + 
				", Duoc dat: " + isBorrow  + ", nguoi dat: " + borrower+ ", Han Dat: " + durationBorrow + '\n';
	}
	
	
	
	
	
	
	

}
