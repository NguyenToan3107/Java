
public class book {
    private String nameBook;
    private double priceBook;
    private dayAuthor dateBook;
    private author authorBook;
    
    public book(String nameBook, int priceBook, dayAuthor dateBook, author authorBook) {
		super();
		this.nameBook = nameBook;
		this.priceBook = priceBook;
		this.dateBook = dateBook;
		this.authorBook = authorBook;
	}

	public void printNameBook() {
    	System.out.println(this.nameBook);
    }
    
    public boolean checkBookAsName(book otherBook) {
    	return this.dateBook == otherBook.dateBook; 
    }
    public double priceAfterDown(double x) {
    	return this.priceBook*(1 - x/100); 
    }
}
