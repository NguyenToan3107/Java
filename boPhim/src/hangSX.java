
public class hangSX {
	private String tenHangSanXuat, quocGia;

	
	public hangSX(String tenHangSanXuat, String quocGia) {
		super();
		this.tenHangSanXuat = tenHangSanXuat;
		this.quocGia = quocGia;
	}

	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}

	@Override
	public String toString() {
		return "hangSX [tenHangSanXuat=" + tenHangSanXuat + ", quocGia=" + quocGia + "]";
	}
	
}
