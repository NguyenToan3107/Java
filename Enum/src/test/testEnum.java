package test;

public class testEnum {
    private day thu;
    private String cacMonHoc;
	public testEnum(day thu, String cacMonHoc) {
		this.thu = thu;
		this.cacMonHoc = cacMonHoc;
	}
	public day getThu() {
		return thu;
	}
	public void setThu(day thu) {
		this.thu = thu;
	}
	public String getCacMonHoc() {
		return cacMonHoc;
	}
	public void setCacMonHoc(String cacMonHoc) {
		this.cacMonHoc = cacMonHoc;
	}
	@Override
	public String toString() {
		return "testEnum [thu=" + thu + ", cacMonHoc=" + cacMonHoc + "]";
	}
    
    
	
}
