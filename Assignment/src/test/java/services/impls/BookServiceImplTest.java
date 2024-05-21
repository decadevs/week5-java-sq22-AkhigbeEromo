package services.impls;

import models.Books;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceImplTest {
    BookServiceImpl bookService = new BookServiceImpl();
    @Test
    void checkBookIsRemaining_BookExists() {
        String bookName = "Things fall Apart";
        Books result = bookService.checkBookIsRemaining(bookName);
        assertNotNull(result);
        assertEquals(bookName, result.getName());
        assertEquals("Chinua Achebe", result.getAuthor());
        assertEquals(1990, result.getYearPublished());
    }
    @Test
    void testCheckBookIsRemaining_BookDoesNotExist() {
        String bookName = "Nonexistent Book";
        Books result = bookService.checkBookIsRemaining(bookName);
        assertNull(result);
    }
}