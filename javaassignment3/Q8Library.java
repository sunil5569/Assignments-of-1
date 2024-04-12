package javaassignment3;

import java.util.ArrayList;

public class Q8Library {

    private ArrayList<Q8> books;

    public Q8Library() {
        books = new ArrayList<>();
    }

    public void addBook(Q8 book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void removeBook(Q8 book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the library: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Q8 book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }

    public static void main(String[] args) {
    	Q8Library library = new Q8Library();
        Q8 book1 = new Q8("The Great Gatsby", "F. Scott Fitzgerald");
        Q8 book2 = new Q8("To Kill a Mockingbird", "Harper Lee");
        Q8 book3 = new Q8("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
        library.removeBook(book2);
        library.displayBooks();
    }
}

/*
Output:
Book added to the library: The Great Gatsby
Book added to the library: To Kill a Mockingbird
Book added to the library: 1984
Books in the library:
Title: The Great Gatsby, Author: F. Scott Fitzgerald
Title: To Kill a Mockingbird, Author: Harper Lee
Title: 1984, Author: George Orwell
Book removed from the library: To Kill a Mockingbird
Books in the library:
Title: The Great Gatsby, Author: F. Scott Fitzgerald
Title: 1984, Author: George Orwell
*/