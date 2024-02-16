public class BookSingletonTest {
    public static void main(String[] args) {
        BookSingleton book1 = BookSingleton.getInstance("titlu1", "autor1");
        BookSingleton book2 = BookSingleton.getInstance("titlu2", "autor2");
        BookSingleton book3 = BookSingleton.getInstance("titlu1", "autor1");

        assert book2 != book1;
        assert book3 == book1;
    }
}
