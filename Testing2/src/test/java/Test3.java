import org.example.Author;
import org.example.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test3 {
    @Test
    public void isMatches() {
        // given
        Author author = new Author("Лев", "Толстой", 5);
        Book book = new Book("Война и мир", 1867, author, 1300);
        // when
        boolean exp = book.matches("Лев");
        // then
        assertTrue(exp);

    }
}
