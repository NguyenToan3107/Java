
public class hocsinh extends connguoi {
     private String tenLop, tenTruong;

	public hocsinh(String hoten, int namsinh, String tenLop, String tenTruong) {
		super(hoten, namsinh);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
    
     public void lamBaiTap() {
    	 System.out.println("ok");
     }
}
