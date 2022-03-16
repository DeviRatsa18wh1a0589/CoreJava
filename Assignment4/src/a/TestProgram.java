package a;

import java.util.ArrayList;

public class TestProgram {
	
	    public static void main(String[] args) {
	        Book b = Book.createTestBook();                       
	        b.sortByTextLenght();
	        printBook(b);         
	    }

	    private static void printBook(Book b) {  
	        ArrayList<Chapter> chapters = b.getAllChapters();
	        for (Chapter c : chapters) {
	            System.out.println(c);
	        }
	    }    
	}
