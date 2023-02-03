
public class main {
    public static void main(String[] args) {
		hangSX h1 = new hangSX("Avatar", "Vietnam");
		hangSX h2 = new hangSX("Transformer", "USA");
		
		Ngay d1 = new Ngay(15, 05, 2022);
		Ngay d2 = new Ngay(31, 01, 2025);
		
		BoPhim boPhim1 = new BoPhim("Bố Già", 2020, h1, 65000, d1);
		BoPhim boPhim2 = new BoPhim("Running Man", 2021, h2, 100000, d2);
		System.out.println(boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println(boPhim1.layTenHangSanXuat());
	}
}
