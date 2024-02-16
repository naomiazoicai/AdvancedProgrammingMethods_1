
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BookFileWriter {

    public static void writeToFile(ArrayList<Book> bookArrayList, String filename) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            bookArrayList.stream()
                    .filter(book -> book.getBorrowedDays() >= 5)
                    .map(book -> book.getTitle().toLowerCase())
                    .forEach(name -> {
                        try {
                            bw.write(name + '\n');

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}