
public class main {
    public static void main(String[] args) {
		HangSanSuat h1 = new HangSanSuat("Hang 1", "USA");
		HangSanSuat h2 = new HangSanSuat("Hãng 2", "USA");
		HangSanSuat h3 = new HangSanSuat("Hãng 3", "Nhật Bản");
		
		PhuongTien p1 = new MayBay("May Bay", h1, "Dau");
		PhuongTien p2 = new XaDap("Xe Dap", h2);
		System.out.println("p1: "+p1.getTenLoaiPhuongTien());
		System.out.println("p1: "+p1.layVanToc());
	}
}
