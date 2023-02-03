
public class XaDap extends PhuongTien{

	public XaDap(String tenLoaiPhuongTien, HangSanSuat hangSanXuat) {
		super(tenLoaiPhuongTien, hangSanXuat);
	}

	@Override
	public double layVanToc() {
		return 20;
	}
    
}
