package package1;

public class AudioBook extends Book {
	
	public int audioLength;
	
	
	//AudioBook constructor with parameters of a Book class
	AudioBook (String title, String author, int year, int audioLength){	
	super(title, author, year, 0);
	this.audioLength = audioLength;
	}
	
	//Method for getting the length of the AudioBook
	public int getLength() {
		return this.audioLength;
	}

}
