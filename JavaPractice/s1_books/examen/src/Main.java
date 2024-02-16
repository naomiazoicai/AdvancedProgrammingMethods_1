//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create an instance of BookFileReader
//        BookFileReader bookFileReader = new BookFileReader();
//
//        // Read books from file
//        List<Book> books = bookFileReader.readBooksFromFile("C:\\Users\\naomi\\MAP_SEM3\\s1_books\\examen\\borrowed_books.csv");
//
//        // Print the books
//        for (Book book : books) {
//            System.out.println(book);
//        }
//    }
//}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        // Create some sample data (list of books)
//        List<Book> books = new ArrayList<>();
//        books.add(new Book("Title1", "Author1", "Fantasy",  1, 101));
//        books.add(new Book("Title1", "Author1", "Fantasy",  1, 101));
//        books.add(new Book("Title1", "Author1", "Fantasy",  1, 101));
//        books.add(new Book("Title2", "Author2", "Mystery", 2, 102));
//        books.add(new Book("Title3", "Author3", "Fantasy", 3, 103));
//        books.add(new Book("Title4", "Author4", "Mystery", 6, 202));
//        books.add(new Book("Title4", "Author4", "Mystery", 6, 202));
//
//        // Create an instance of BookFilter
//        BookFilter bookFilter = new BookFilter();
//
//        // Call the borrowedBooksByGenre method to display the genres and borrow counts
//        bookFilter.borrowedBooksByGenre(books);
//
        BookFileReader reader = new BookFileReader();
        List<Book> bookz = reader.readBooksFromFile("C:\\Users\\naomi\\MAP_SEM3\\s1_books\\examen\\src\\borrowed_books.csv");

        BorrowedBooksPrinter printer = new BorrowedBooksPrinter(bookz);
        printer.printBorrowedBooks();
    }
}
