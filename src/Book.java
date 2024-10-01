import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private LocalDate date_read;

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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public LocalDate getDate_read() {
        return date_read;
    }

    public void setDate_read(LocalDate date_read) {
        this.date_read = date_read;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", date_read=" + date_read +
                '}';
    }
}
