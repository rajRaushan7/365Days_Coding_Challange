import java.util.*;

class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && book.isAvailable) {
                book.isAvailable = false;
                System.out.println("Borrowed: " + book.title);
                return;
            }
        }
        System.out.println("Book not available: " + title);
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && !book.isAvailable) {
                book.isAvailable = true;
                System.out.println("Returned: " + book.title);
                return;
            }
        }
        System.out.println("Book not found or already returned: " + title);
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println(book.title + " by " + book.author);
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));

        library.displayAvailableBooks();

        library.borrowBook("1984");
        library.borrowBook("The Alchemist");
        library.borrowBook("The Alchemist");

        library.returnBook("1984");
        library.displayAvailableBooks();
    }
}