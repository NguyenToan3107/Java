package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSinhvien {
     private ArrayList<Sinhvien> danhSach;
     
     public ListSinhvien() {
    	 this.danhSach = new ArrayList<Sinhvien>();
     }
     
     public ListSinhvien(ArrayList<Sinhvien> danhSach) {
    	 this.danhSach = danhSach;
     }
     
     // 1. Them sinh vien vao danh sach
     public void add(Sinhvien sv) {
    	 this.danhSach.add(sv);
     }
     
     // 2. In danh sach sinh vien ra man hinh
     public void print() {
    	for(Sinhvien sv : danhSach) {
    		System.out.println(sv);
    	}
     }
     
     // 3. Kiem tra ds co rong ko
     public boolean isEmpty() {
    	 return this.danhSach.isEmpty();
     }
     
     // 4. lay ra so luong sinh vien
     public int size() {
    	 return this.danhSach.size();
     }
     
     // 5. Lam rong danh sach sinh vien
     public void removeAll() {
    	 this.danhSach.removeAll(danhSach);
     }
     
     // 6. ktra sinh vien co ton tai trong ds ko
     public boolean kiemTraTonTai(Sinhvien sv) {
    	 return this.danhSach.contains(sv);
     }
     
     // 7. xoa 1 sv khoi ds dua vao msv
     public void remove(Sinhvien sv) {
    	 this.danhSach.remove(sv);
     }
     
     // 8. tim kiem tat ca sv dua vao ten nhap tu ban phim
     public void check(String ten) {
    	 for (Sinhvien sv : danhSach) {
			if(sv.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sv);
			}
		}
     }
     
     // 9. xuat ra ds sinh vien co diem tu cao xuong thap
     public void sortPrint() {
    	 Collections.sort(danhSach, new Comparator<Sinhvien>() {

			@Override
			public int compare(Sinhvien o1, Sinhvien o2) {
				if(o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
					return -1;					
				}else if(o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
					return 1;
				}else {
					return 0;
				}
			}
		});
     }

     
}
