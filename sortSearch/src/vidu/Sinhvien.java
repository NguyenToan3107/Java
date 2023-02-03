package vidu;

public class Sinhvien implements Comparable<Sinhvien> {
    private int maSinhVien;
    private String heVaTen;
    private String tenLop;
    private double diemTB;
    
	public Sinhvien(int maSinhVien, String heVaTen, String tenLop, double diemTB) {
		this.maSinhVien = maSinhVien;
		this.heVaTen = heVaTen;
		this.tenLop = tenLop;
		this.diemTB = diemTB;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHeVaTen() {
		return heVaTen;
	}

	public void setHeVaTen(String heVaTen) {
		this.heVaTen = heVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public String getTen() {
		String s = this.heVaTen.trim();
		if(s.indexOf(" ")>0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		}else {
			return s;
		}
	}
	
	@Override
	public String toString() {
		return "Sinhvien [maSinhVien=" + maSinhVien + ", heVaTen=" + heVaTen + ", tenLop=" + tenLop + ", diemTB="
				+ diemTB + "]";
	}

	@Override
	public int compareTo(Sinhvien o) {
		// < 0
		// = 0
		// > 0
		// dua tren so sanh ten
		// ten Adam, Obama, Nguyen Van A, Tran Huyen Trang
		String tenThis = this.getTen();
		String tenO = o.getTen();
		
		
		return tenThis.compareTo(tenO);
	}
    
    
}
