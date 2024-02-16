public class BookSingleton {
    private static BookSingleton instance;

    private String title;
    private String author;

    private BookSingleton(){}

    public static BookSingleton getInstance(String title, String author)
    {
        if(instance == null || !instance.getTitle().equals(title) || !instance.getAuthor().equals(author))
        {
            instance = new BookSingleton();
            instance.setTitle(title);
            instance.setAuthor(author);
        }
        return instance;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
