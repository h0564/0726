package array;

public class Book {
	String bookName;
	String author;
	
	Book(){}
	
	String getBookName() {
		return this.bookName;
	}
	void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	String gerAuthor() {
		return this.author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	Book(String bookName , String author){
		this.bookName = bookName;
		this.author = author;
	}
	public String toString() {
		return "bookName = "+this.bookName+" author = "+this.author;
	}
}
