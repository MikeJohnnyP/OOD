package lab3.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RentItem {

    private Movie movie;
    private Date startDate;
    private Date endDate;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public RentItem(Movie movie, Date startDate) {
        this.movie = movie;
        this.startDate = startDate;
    }

    public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getRentDays() {
        Date currentDate = new Date();
        long duration = (currentDate.getTime() - startDate.getTime()) / 1000; // tu milisecond qua second
        long countRentDay = duration / 86400;
        if ((countRentDay % 86400) > (2 * 3600)) {
            countRentDay++;
        }
        return (int) countRentDay;
    }
	
	public int getRentDaysWithEndDay() {
		 long duration = (endDate.getTime() - startDate.getTime()) / 1000; // tu milisecond qua second
	        long countRentDay = duration / 86400;
	        if ((countRentDay % 86400) > (2 * 3600)) {
	            countRentDay++;
	        }
	        return (int) countRentDay;
	}

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public double getCharge() {
        return movie.getCharge(getRentDays());
    }
   
    public double getChargeWithEndDay() {
        return movie.getCharge(getRentDaysWithEndDay());
    }

    public double getFrequentRenterPointers() {
        return movie.getFrequentRenterPointers(getRentDays());
    }
    
    public double getFrequentRenterPointersWithEndDay() {
        return movie.getFrequentRenterPointers(getRentDaysWithEndDay());
    }

}
