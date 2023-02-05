import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;



public class rutTham {
	Set<String> tapHopPhieuDuThuong = new HashSet<String>();
	
    public rutTham() {
	}

    public boolean themPhieu(String giatri) {
    	return this.tapHopPhieuDuThuong.add(giatri);
    }
    
    public boolean xoaPhieu(String giatri) {
    	return this.tapHopPhieuDuThuong.remove(giatri);
    }
    
    public boolean ktraPhieuTonTai(String giatri) {
    	return this.tapHopPhieuDuThuong.contains(giatri);
    }
    
    public void xoaAllPhieu() {
    	this.tapHopPhieuDuThuong.clear();
    }
    
    public int soLuongPhieu() {
    	return this.tapHopPhieuDuThuong.size();
    }
    
    public String rutMotPhieu() {
    	String ketQua = "";
    	Random rd = new Random();
    	int viTri = rd.nextInt(this.tapHopPhieuDuThuong.size());
    	ketQua = (String) this.tapHopPhieuDuThuong.toArray()[viTri];
    	return ketQua;
    }
    public void inTatCa() {
    	System.out.println(Arrays.toString(this.tapHopPhieuDuThuong.toArray()));
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		rutTham rt = new rutTham();
		do {
			System.out.println("-----------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Them ma so du thuong.");
			System.out.println("2. Xoa ma so du thuong.");
			System.out.println("3. Kiem tra ma so du thuong co ton tai ko.");
			System.out.println("4. Xoa tat ca phieu du thuong.");
			System.out.println("5. So luong phieu du thuong.");
			System.out.println("6. Rut tham trung thuong.");
			System.out.println("7. In ra tat ca cac phieu.");
			System.out.println("0. Thoat khoi chuong trinh.");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			if(luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhap vao ma phieu du thuong: ");
				String giaTri = sc.nextLine();
				if(luaChon == 1) {
					rt.themPhieu(giaTri);
				}else if(luaChon == 2) {
					rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Ket qua ktra la: "+rt.ktraPhieuTonTai(giaTri));
				}
			}else if(luaChon == 4) {
				rt.xoaAllPhieu();
			}else if(luaChon == 5) {
				System.out.println("So luong phieu la: "+ rt.soLuongPhieu());
			}else if(luaChon == 6) {
				System.out.println("Ma so trung thuong la: "+rt.rutMotPhieu());
			}else if(luaChon == 7) {
				System.out.println("Cac ma phieu du thuong: ");
				rt.inTatCa();
			}
		}while(luaChon != 0);
	}
}
