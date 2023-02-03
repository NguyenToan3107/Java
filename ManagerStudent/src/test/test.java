package test;

import java.util.Scanner;

import javax.management.modelmbean.RequiredModelMBean;

import main.Student;
import main.listStudent;

public class test {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		listStudent list = new listStudent();
		int sel;
		do {
			System.out.println("============RRQUIRE===========");
			System.out.println("Please input 1 -> 9.");
			System.out.println("1. Them sinh vien vao danh sach.");
			System.out.println("2. Kiem tra danh sach rong hay ko.");
			System.out.println("3. lay ra so luong sinh vien trong danh sach.");
			System.out.println("4. Lam rong danh sach.");
			System.out.println("5. In danh sach ra man hinh.");
			System.out.println("6. Kiem tra sinh vien co ton tai ko.");
			System.out.println("7. Xoa 1 sinh vien khoi danh sach.");
			System.out.println("8. Tim kiem all sinh vien theo Ten nhap tu ban phim.");
			System.out.println("9. Xuat ra ds sv co diem tu cao den thap.");
			System.out.println("0. Thoat chuong trinh.");
			System.out.print("Enter your choice: ");
			sel = sc.nextInt();
		    sc.nextLine();
			switch(sel) {
				case 0: {
					System.out.println("Cam on vi da su dung.");
					break;
				}
				case 1: {
					System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
					System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
					System.out.println("Nhap nam sinh: "); int namSinh = sc.nextInt();
					System.out.println("Nhap diem trung binh: "); float diemTrungBinh = sc.nextFloat();
					Student sv = new Student(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
					list.add(sv);   
					break;
				}
				case 2: {
					System.out.println("----------------------------------");
					System.out.println("List empty ? "+list.checkEmpty());
					System.out.println("----------------------------------");
					break;
				}
				case 3: {
					System.out.println("----------------------------------");
                    System.out.println("Size = "+list.size());
					System.out.println("----------------------------------");
					break;
				}
				case 4: {
					System.out.println("----------------------------------");
                    System.out.println("RemoveAll.");
                    list.removeAll();
                    System.out.println("Successful for removing.");
					System.out.println("----------------------------------");
					break;
				}
				case 5: {
					System.out.println("----------------------------------");
                    list.printList();
					System.out.println("----------------------------------");
					break;
				}
				case 6: {
					System.out.println("----------------------------------");
                    System.out.println("Enter ma sinh vien:"); String maSinhVien = sc.nextLine();
                    Student sv = new Student(maSinhVien);
                    System.out.println("Ckeck: "+list.checkStudent(sv));
                    System.out.println("Checking successful.");
					System.out.println("----------------------------------");
					break;
				}
				case 7: {
					System.out.println("----------------------------------");
                    System.out.println("Enter ma sinh vien:"); String maSinhVien = sc.nextLine();
                    Student sv = new Student(maSinhVien);
                    System.out.println("Remove: "+ list.removeStudent(sv));
                    System.out.println("Removing successful.");
					System.out.println("----------------------------------");
					break;
				}
				case 8: {
					System.out.println("----------------------------------");
                    System.out.println("Enter Ten sinh vien:"); String hoVaTen = sc.nextLine();
                    list.searchStudent(hoVaTen);
                    System.out.println("Searching successful.");
					System.out.println("----------------------------------");
					break;
				}
				case 9: {
					System.out.println("----------------------------------");
                    list.sortStudent();
                    list.printList();
					System.out.println("----------------------------------");
					break;
				}
			 }
		}while(sel != 0);
	}
}
