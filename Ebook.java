package package1;

public class Ebook extends Book {
	
	private String format;
	
	Ebook(String title, String author, int year, int pageCount, String format){
		super(title, author, year, pageCount);
		
		this.format = format;
	}
	
	@Override
	public String getTitle() {
		
		return this.format;
	}
	
	public String getFormat() {
		return this.format;
	}
	

}
