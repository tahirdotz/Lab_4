import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class BookReaderTest {

    @Test
    public void testTotalBooks() {
        BookReader reader = new CSVBookReader();
        List<Book> books = reader.readsBook("D:\\test1_OOCII_LAB_3\\Lab_4\\src\\book.csv");
        assertEquals(5, books.size(), "The number of books read from the CSV should be 5.");
    }

}

