import java.util.Objects;

public class myDate {
     private int day;
     private int month;
     private int year;
     
     public myDate(int day, int month, int year) {
		super();
		if(day >=1 && day <= 31) {
			this.day = day;			
		}else {
			this.day = 1;
		}
		if(month >=1 && month <=12) {			
			this.month = month;
		}else {
			this.month = 1;
		}
		if(year >=1) {
			this.year = year;			
		}else {
			this.year = 1;
		}
	 }
	 public void printDay() {
    	 System.out.println("Day: " + this.day);
     }
     public void printMonth() {
    	 System.out.println("Month: " + this.month);
     }
     public void printYear() {
    	 System.out.println("Year: " + this.year);
     }
     public void printDate() {
    	 System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
     }
     public int getDay() {
    	 return this.day;
     }
     public void setDay(int d) {
    	 if(d>=1 && d<=31) {
    		 this.day = d;
    	 }
     }
     public int getMonth() {
    	 return this.month;
     }
     public void setMonth(int m) {
    	 if(m>=1 &&m<=12) {
    		 this.month = m;
    	 }
     }
     public int getYear() {
    	 return this.year;
     }
     public void setYear(int y) {
    	 if(y>=1) {
    		 this.year = y;
    	 }
     }
	@Override
	public String toString() {
		return "myDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myDate other = (myDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
     
}


