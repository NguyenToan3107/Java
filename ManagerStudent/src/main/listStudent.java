package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class listStudent {
    private ArrayList<Student> list;

	public listStudent() {
		this.list = new ArrayList<Student>();
	}

	public listStudent(ArrayList<Student> list) {
		this.list = list;
	}
	
	// 1. them sv
    public void add(Student sv) {
    	this.list.add(sv);
    }
    // 2. check empty
    public boolean checkEmpty() {
    	return this.list.isEmpty();
    }
    
    // 3. lay size
    public int size() {
    	return this.list.size();
    }
    
    // 4. removeAll
    public void removeAll() {
    	this.list.removeAll(list);
    }
    // 5. print list
    public void printList() {
    	for (Student student : list) {
			System.out.println(student);
		}
    }
    
    // 6. check sv co trong list ko
    public boolean checkStudent(Student sv) {
    	return this.list.contains(sv);
    }
    // 7. xoa 1 sv ra khoi ds
    public boolean removeStudent(Student sv) {
    	return this.list.remove(sv);
    }
    
    // 8. tim kiem sv dua vao Ten nhap tu ban phim
    public void searchStudent(String ten) {
    	for (Student student : list) {
			if(student.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(student);
			}
		}
    }
   // 9. xuat ra man hinh dnah sach diem tu cao den thap
    public void sortStudent() {
    	Collections.sort(this.list, new Comparator<Student>() {
			@Override
			public int compare(Student sv1, Student sv2) {
				if(sv1.getDiemTB() > sv2.getDiemTB()) {
					return 1;					
				} else if(sv1.getDiemTB() < sv2.getDiemTB()) {
					return -1;
				}else {
					return 0;
				}
			}
    	});
    }
}
