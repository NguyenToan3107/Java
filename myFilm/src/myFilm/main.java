package myFilm;

public class main {
     public static void main(String[] args) {
    	 myDate d1 = new myDate(15, 5, 2022);
 		myDate d2 = new myDate(15, 7, 2024);
 		
 		hangSX h1 = new hangSX("toan", "trang");
 		hangSX h2 = new hangSX("toanhoc", "trangtrai");
 		
 		myFilm f1 = new myFilm("Bo gia", 2020, 65000, h1, d1);
 		myFilm f2 = new myFilm("Bo gia1", 2021, 65001, h2, d2);
 		
 		f1.printNameFilm();
	}
}
