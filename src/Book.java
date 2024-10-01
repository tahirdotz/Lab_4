public class Book {
    private String title;
    private String author;
    private String genre;
    private String pages;
    private String date_read;

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

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getDate_read() {
        return date_read;
    }

    public void setDate_read(String date_read) {
        this.date_read = date_read;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages='" + pages + '\'' +
                ", date_read='" + date_read + '\'' +
                '}';
    }
}
