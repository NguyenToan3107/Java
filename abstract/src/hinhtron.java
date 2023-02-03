
public class hinhtron extends hinh{
    private double r;

	public hinhtron(toado toado, double r) {
		super(toado);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		return Math.PI*this.r*this.r;
	}
    
    
}
