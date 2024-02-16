public class Book {

    public String title;
    public String author;
    public String genre;
    public long borrowedDays;
    public long borrowerId;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", borrowedDays=" + borrowedDays +
                ", borrowerId=" + borrowerId +
                '}';
    }

    public Book(String title, String author, String genre, long borrowedDays, long borrowerId) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.borrowedDays = borrowedDays;
        this.borrowerId = borrowerId;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getBorrowedDays() {
        return borrowedDays;
    }

    public void setBorrowedDays(long borrowedDays) {
        this.borrowedDays = borrowedDays;
    }

    public long getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(long borrowerId) {
        this.borrowerId = borrowerId;
    }
}
