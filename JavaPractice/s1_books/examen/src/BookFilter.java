import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookFilter {

    public void borrowedBooksByGenre(List<Book> books) {
//        // Collect the genre counts
//        Map<String, Long> genreCounts = books.stream()
//                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()));

        // Sort the entries by count in descending order and print them
        books.stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()))
                .entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
