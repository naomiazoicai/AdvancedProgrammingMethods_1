import java.util.List;

public class BorrowedBooksPrinter {
    private List<Book> borrowedBooks;

    public BorrowedBooksPrinter(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void printBorrowedBooks() {
        Runnable runnable1 = () -> {
            for (Book book : borrowedBooks) {
                System.out.println("Thread 1: " + book.toString());
            }
        };

        Thread thread1 = new Thread(runnable1);

        Runnable runnable2 = () -> {
            System.out.println("Thread 2: Start");
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Done");
        };
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
