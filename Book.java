package package1;

public class Book {
	
	private String title;
	private String author;
	private int year;
	private int pageCount;
	
	// Book Constructor
	Book (String title, String author, int year, int pageCount){
		this.title = title;
		this.author = author;
		this.year = year;
		this.pageCount = pageCount;
	}
	
	//custom toString method for created reference type/class
	public String toString() {
	
		return String.format("%s by %s in %d, ", this.title, this.author, this.year);
	}
	
	//Method for getting the title property
	public String getTitle() {
		return this.title;
	}
	
	//Method for getting an author property
	public String getAuthor() {
		return this.author;
	}
	
	//Method for getting year the property
	public int getYears() {
		return this.year;
	}
	//Method for getting the number of pages
	public int pages() {
		return this.pageCount;
	}

}
