package array;

import java.util.ArrayList;

public class BookArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		Book book [] = new Book[5];
//		book[0] = new Book("책1","김민수1"); sum++;
//		book[1] = new Book("책2","김민수2"); sum++;
//		book[2] = new Book("책3","김민수3"); sum++;
//		
//		for (int i = 0; i < sum; i++) {
//			System.out.println(book[i]);
//		}
		Book [] book = {new Book("책1","곽여송1"),new Book("책2","곽여송2")};
		
		for (Book b : book) {
			System.out.println(b);
		}
		
	
	}

}
