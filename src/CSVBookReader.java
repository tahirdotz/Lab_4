import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVBookReader implements BookReader {
    @Override
    public List<Book> readsBook(String filepath) {
        List<Book> books = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
            String line;
            boolean isFirstLine = true;
            while ((line = bufferedReader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                String[] nextRecord = line.split(",");
                Book book = new Book();
                book.setTitle(nextRecord[0]);
                book.setAuthor(nextRecord[1]);
                book.setGenre(nextRecord[2]);
                book.setPages(nextRecord[3]);
                book.setDate_read(nextRecord[4]);
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}

