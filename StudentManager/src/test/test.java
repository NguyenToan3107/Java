package test;

import java.util.Scanner;

import main.ListSinhvien;
import main.Sinhvien;

public class test {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
		ListSinhvien list = new ListSinhvien();
		int luaChon = 0;
		do {
			System.out.println("MENU ---------- ");
			System.out.println("Vui long chon chuc nang: ");
			System.out.println(
			  "1.	Them sinh vien vao danh sach.\n"
			+ "2.	In danh sach sinh viên ra man hinh.\n"
			+ "3.	Kiem tra danh sach có rong hay khong.\n"
			+ "4.	Lay ra so luong sinh vien trong danh sach.\n"
			+ "5.	Lam rong danh sach sinh vien.\n"
			+ "6.	Kiem tra sinh vien có ton tai trong danh sach hay khong, dua tren ma sinh vien.\n"
			+ "7.	Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\n"
			+ "8.	Tim kiem tat ca sinh vien dua tren Ten đuoc nhap tu ban phim.\n"
			+ "9.	Xuat ra danh sach sinh vien co điem tu cao đen thap.\n"
			+ "0.   Thoat khoi chuong trinh");			
			luaChon = sc.nextInt(); // enter cung la 1 lan nhap
			sc.nextLine();
			if(luaChon == 1) {
				System.out.println("Nhap ma sinh vien: "); String maSinhvien = sc.nextLine();
				System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
				System.out.println("Nhap nam sinh: "); int namSinh = sc.nextInt();
				System.out.println("Nhap diem TB: "); float diemTrungBinh = sc.nextFloat();
				Sinhvien sv = new Sinhvien(maSinhvien, hoVaTen, namSinh, diemTrungBinh);
				list.add(sv);
			}else if(luaChon == 2) {
				// in danh sach
				list.print();
				
			}else if(luaChon == 3) {
				// ktra rong
				System.out.println("Ktra ds rong: "+list.isEmpty());
			}else if(luaChon == 4) {
				// size
				System.out.println("So luong: "+list.size());
			}else if(luaChon == 5) {
				// removeAll
				list.removeAll();
				
			}else if(luaChon == 6) {
				// kiem tra xem sv co ton tai hay ko
				System.out.println("Sinh vien: ");
				System.out.println("Nhap ma sinh vien can tim: ");
				String maSinhVien = sc.nextLine();
				Sinhvien sv = new Sinhvien(maSinhVien);
				System.out.println("Kiem tra: "+list.kiemTraTonTai(sv));
			}else if(luaChon == 7) {
				// xoa 1 sv ra khoi ds
				System.out.println("Sinh vien: ");
				System.out.println("Nhap ma sinh vien can xoa: ");
				String maSinhVien = sc.nextLine();
				Sinhvien sv = new Sinhvien(maSinhVien);
				list.remove(sv);
				System.out.println("Xoa thanh cong");
			}else if(luaChon == 8) {
				// tim kiem sv theo ten
				System.out.println("Nhap ten can tim: ");
				String hoVaTen = sc.nextLine();
				list.check(hoVaTen);
			}else if(luaChon == 9) {
				// sap xep
				list.sortPrint();
				list.print();
			}
		}while(luaChon != 0);
	}
}
