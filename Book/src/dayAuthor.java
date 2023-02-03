
public class dayAuthor {
    private int day;
    private int month;
    private int year;
    
    public dayAuthor(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
    	return this.day;
    }
    public void setDay(int d) {
    	if(d >= 1 && d <= 31) {
    		this.day = d;
    	}
    }
    public int getMonth() {
    	return this.month;
    }
    public void setMonth(int m) {
    	if(m >= 1 && m <= 12) {
    		this.month = m;
    	}
    }
    public int getYear() {
    	return this.year;
    }
    public void setYear(int y) {
    	if(y >= 1) {
    		this.year = y;
    	}
    }
	@Override
	public String toString() {
		return "dayAuthor [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
    
} 
