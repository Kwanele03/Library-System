package package1;

public class FirstClass {

	 public static void main(String[] args) {
		 		 
		 
	// Creating User class object named user. 
	 User user = new User("Kwanele Ntshele", "2009-06-07"); 
	 
	// Creating Book class object named book.
	 Book book = new Book("Head First Java", "Bert Bates and Kathy Sierra", 2005, 788 ); 
	 
	 // Creating an audio book for Head First Java book
	 AudioBook audioBook = new AudioBook ("Head First Java AudioBook", "Bert Bates and Kathy Sierra", 2006, 412);
	 
	 // Creating an Ebook for Head First Java book
	 Ebook eBook = new Ebook("Head First Java e-Book", "Bert Bates and Kathy Sierra", 2005, 812, "PDF");
	 
	 
	 
	// Calling the borrow method from the user object
	 user.borrow(book); 
	 
	
	 
	// Printing out user name, birthDay, and age in years.
	 System.out.printf("My name is %s, I was born on %s. I am now %d years old. ", user.getName(), user.getBirthDay(),user.age());
	 
	// Printing out the user who has borrowed the book, and the book whom they have borrowed.
	 System.out.printf("I, have borrowed this book: %s \n",user.borrowedBooks()); 
	 
	
	 //Printing out AudioBook
	 System.out.printf("Book Type: " + audioBook + "it plays for %d minutes, (5hrs). \n", audioBook.getLength());
	 
	 //Printing out e-Book
	 System.out.printf("Book Type: " + eBook + "with %d pages (%s) \n", eBook.pages(), eBook.getFormat());

    }
	
}
	
	

      
       
       
    
       
       
