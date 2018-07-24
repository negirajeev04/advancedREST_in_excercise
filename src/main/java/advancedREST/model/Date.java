package advancedREST.model;

public class Date {

	private int date;
	private int month;
	private int year;

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
	}

	/*
	 * public static Date valueOf(String dateString) {
	 * 
	 * Date myDate = new Date(); myDate.setDate(4); myDate.setMonth(6);
	 * myDate.setYear(2018);
	 * 
	 * return myDate; }
	 */

	public Date() {}
	
	public Date(String dateString) {
		this.date = 4;
		this.month = 6;
		this.year = 2018;
	}

}
