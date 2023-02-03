
public class connguoi {
    private String hoten;
    private int namsinh;
    
	public connguoi(String hoten, int namsinh) {
		super();
		this.hoten = hoten;
		this.namsinh = namsinh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
    
	public void an() {
		System.out.println("mam mam");
	}
	
	public void ngu() {
		System.out.println("kho kho");
	}
	public void nghi() {
		System.out.println("haizz");
	}
}
