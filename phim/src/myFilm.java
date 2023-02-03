
public class myFilm {
	private String nameFilm;
    private int yearFilm;
    private double priceFilm;
    private hangSX hangSanXuat;
    private myDate date;
    
    public myFilm(String nameFilm, int yearFilm, double priceFilm, hangSX hangSanXuat, myDate date) {
		super();
		this.nameFilm = nameFilm;
		this.yearFilm = yearFilm;
		this.priceFilm = priceFilm;
		this.hangSanXuat = hangSanXuat;
		this.date = date;
	}
    
	public String getNameFilm() {
		return nameFilm;
	}

	public void setNameFilm(String nameFilm) {
		this.nameFilm = nameFilm;
	}

	public int getYearFilm() {
		return yearFilm;
	}

	public void setYearFilm(int yearFilm) {
		this.yearFilm = yearFilm;
	}

	public double getPriceFilm() {
		return priceFilm;
	}

	public void setPriceFilm(double priceFilm) {
		this.priceFilm = priceFilm;
	}

	public hangSX getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(hangSX hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public myDate getDate() {
		return date;
	}

	public void setDate(myDate date) {
		this.date = date;
	}

	public boolean check(myFilm otherFilm) {
    	return this.priceFilm < otherFilm.priceFilm;
    }
    public void printNameFilm() {
    	System.out.println(this.nameFilm);
    }
    
    public double sauKhuyenMai(double x) {
    	return this.priceFilm * (1 - x/100);
    }
}
