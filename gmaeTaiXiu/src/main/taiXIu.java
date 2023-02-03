package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

// 1 nguoi choi se co 1 tai khoan, nguoi choi co quyen dat cuoc so tien it hon or bang so tien ho dang co
// luat choi nhu sau
// co 3 vien xuc xac
// moi vien xuc xac co 6 mat tu 1 den 6 . moi lan lac se ra 1 kq
// kq = gia tri xx1 + xx2 + xx3
// 1. neu tong bang 3 or 18 => cai an het, nguoi choi thua
// 2. tong = (4 -> 10) => xiu => neu player dat xiu => player win ngoac lai se lost
// 3. tong = (11 -> 17) => tai => neu player dat tai => player win nguoc lai se lost

public class taiXIu {
    public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000;
		Scanner sc = new Scanner(System.in);
		
		Locale lc = new Locale("en", "US");
//		NumberFormat numf = NumberFormat.getInstance(lc);
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		int luaChon = 1;
		do {
			System.out.println("------------Require------------");
			System.out.println("1. Chon (1) de tiep tuc choi.");
			System.out.println("Chon (phim bat ky) de thoat.");
			luaChon = sc.nextInt();
			if(luaChon == 1) {
				System.out.println("------------Require------------");
				// dat cuoc
				System.out.println("***Get Start***");
				double datCuoc = 0;
				do {
					System.out.println("***Dat cuoc ( 0 < so tien cuoc <="+numf.format(taiKhoanNguoiChoi)+":");
					System.out.println("***Tai khoan cua ban: "+numf.format(taiKhoanNguoiChoi)+ ", ban muon cuoc bao nhieu?");
					datCuoc = sc.nextDouble();					
				}while(datCuoc > taiKhoanNguoiChoi || datCuoc < 0);
				
				// chon tai xiu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("***Chon: 1 <-> tai or 2 <-> xiu");
					luaChonTaiXiu = sc.nextInt();				
				}while(luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				
				// tung xuc xac
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				int giaTri1 = xucXac1.nextInt(5) + 1;
				int giaTri2 = xucXac2.nextInt(5) + 1;
				int giaTri3 = xucXac3.nextInt(5) + 1;
				int tong = giaTri1 + giaTri2 + giaTri3;
				// tinh toan ket qua
				System.out.println("Kat qua: "+giaTri1+" - "+giaTri2+" - "+giaTri3);
				if(tong == 3 || tong == 18) {
					taiKhoanNguoiChoi = taiKhoanNguoiChoi - datCuoc;
					System.out.println("Tong la: "+tong+" => Nha cai an het, ban da thua!");
					System.out.println("Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi));
				}else if(tong >=4 && tong<=10) {
					System.out.println("Xiu:");
					if(luaChonTaiXiu == 2) {
						taiKhoanNguoiChoi+=datCuoc;
						System.out.println("You Win");
						System.out.println("Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi));
					}else {
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("You Lost");
						System.out.println("Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi));
					}
				}else {
					System.out.println("Tai:");
					if(luaChonTaiXiu == 1) {
						taiKhoanNguoiChoi+=datCuoc;
						System.out.println("You Win");
						System.out.println("Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi));
					}else {
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("You Lost");
						System.out.println("Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi));
					}
				}
				
			}
		}while(luaChon == 1);
		
	}
}
