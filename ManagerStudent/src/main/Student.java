package main;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String maSV;
    private String hoVaTen;
    private int namSinh;
    private float diemTB;
	public Student(String maSV, String hoVaTen, int namSinh, float diemTB) {
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}
	public Student(String maSV) {
		this.maSV = maSV;
	}

	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	@Override
	public String toString() {
		return "Student [maSV=" + maSV + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTB=" + diemTB + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.maSV.compareTo(o.maSV);
	}
	@Override
	public int hashCode() {
		return Objects.hash(diemTB, hoVaTen, maSV, namSinh);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(this.maSV, other.maSV);
	}
    
    
}
