import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookFileReader {

    public static List<Book> readBooksFromFile(String filename) {
        List<Book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            // Skip the header line
            String header = br.readLine();

            String line;
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(";");
                Book book = new Book(data[0], data[1], data[2], Long.parseLong(data[3]), Long.parseLong(data[4]));
                books.add(book);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}
