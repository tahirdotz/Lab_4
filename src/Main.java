import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVBookReader csvBookReader = new CSVBookReader();

        List<Book> books = csvBookReader.readsBook("D:\\test1_OOCII_LAB_3\\Lab_4\\src\\book.csv");

        System.out.println("Number of books: " + books.size());

        System.out.println("Book Titles:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
