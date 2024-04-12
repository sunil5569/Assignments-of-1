/*
8. Create classes to represent a Library and Book. The Library class should contain
an Array of Book objects. Implement methods to add, remove, and display books
in the library.
*/
package javaassignment3;
import java.util.ArrayList;
public class Q8 
{
	    private String title;
	    private String author;

	    public Q8(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }
	}

