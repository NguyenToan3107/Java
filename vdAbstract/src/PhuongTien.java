
public abstract class PhuongTien {
     protected String tenLoaiPhuongTien;
     protected HangSanSuat hangSanXuat;
	public PhuongTien(String tenLoaiPhuongTien, HangSanSuat hangSanXuat) {
		super();
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}
	public String getTenLoaiPhuongTien() {
		return tenLoaiPhuongTien;
	}
	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}
	public HangSanSuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanSuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
     
    public String layTenHangSanXuat() {
    	return this.hangSanXuat.getTenHang();
    }
    public void batDau() {
		System.out.println("Bắt đầu ....");
	}

	public void tangToc() {
		System.out.println("Tăng tốc ...");
	}
	
	public void dungLai() {
		System.out.println("Dừng lại ...");
	}
	public abstract double layVanToc();
} 
