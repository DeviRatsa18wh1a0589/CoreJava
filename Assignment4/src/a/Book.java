package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book {
	    @SuppressWarnings("unused")
		private String title;
	    @SuppressWarnings("unused")
		private String author;
	    private ArrayList<Chapter> chapters;

	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.chapters = new ArrayList<Chapter>();         }

	    public static Book createTestBook() {
	        Book book = new Book("My first book", "John Johnson");            
	        Chapter chapter = new Chapter(5, "The trip");
	        book.addChapter(chapter);        
	        chapter = new Chapter(2, "The child");
	        book.addChapter(chapter);        
	        chapter = new Chapter(1, "Finally");
	        book.addChapter(chapter);
	        chapter = new Chapter(8, "The house");
	        book.addChapter(chapter);
	        chapter = new Chapter(3, "The boat ride");
	        book.addChapter(chapter);            
	        return book;
	    }

	    private void addChapter(Chapter chapter) {
			// TODO Auto-generated method stub
			
		}

		public void sort(Comparator<Chapter> sortOrder) {  //Problem seem to be here
	        Collections.sort(chapters, sortOrder);
	    }

	    public void sortByTextLenght() {
	        sort(new Comparator<Chapter>() {
	            public int compare(Chapter c1, Chapter c2) {
	                System.out.println(c2.getText().length() - c1.getText().length());
	                return c2.getText().length() - c1.getText().length();
	            }
	        });
	    }               

	    public ArrayList<Chapter> getAllChapters() {
	        return chapters;
	    }
}
