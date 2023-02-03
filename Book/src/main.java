
public class main {
    public static void main(String[] args) {
		dayAuthor d1 = new dayAuthor(31, 7, 2003);
		dayAuthor d2 = new dayAuthor(21, 7, 2003);
		author a1 = new author("Toan", d1);
		author a2 = new author("Trang", d2);
		book b1 = new book("I love You", 10000, d1, a1);
		book b2 = new book("I love You, too", 100000, d2, a2);
		b1.printNameBook();
		System.out.println(b1.checkBookAsName(b2));
		System.out.println("Book sale 10%: "+b1.priceAfterDown(10));
	}
}
