
public class main {
    public static void main(String[] args) {
		toado td1 = new toado(5, 5);
		toado td2 = new toado(1, 2);
		
		hinh h1 = new diem(td1);
		hinh h2 = new hinhtron(td2, 12);
		
		System.out.println("DT1: "+ h1.tinhDienTich());
	}
}
