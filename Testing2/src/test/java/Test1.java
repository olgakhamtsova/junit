import org.example.Author;
import org.example.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    @Test
    public void estPrice() {
        // given
        Author author = new Author("Лев", "Толстой", 5);
        Book book = new Book("Война и мир", 1867, author, 1300);
        // when
        int exp = book.estimatePrice();
        int act = 8720;
        // then
        assertEquals(exp, act);


    }
}
