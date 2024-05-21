package services.impls;


import org.junit.jupiter.api.Test;
import enums.Gender;
import enums.Role;
import models.Person;
import services.LibraryService;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {
        LibraryServiceImpl bookService = new LibraryServiceImpl();

    @Test
    void giveBookByPriority() {
        String book = "Things fall Apart";
        Person result;
        result = bookService.giveBookByPriority(book);
        assertEquals("Eromosele Akhigbe", result.getName());
        assertEquals(23, result.getAge());
        assertEquals(Gender.MALE, result.getGender());
        assertEquals(Role.TEACHER, result.getRole());

    }

    @Test
    void giveBookByOrder() {
        String book = "Things fall Apart";
        Person result;
        result = bookService.giveBookByOrder(book);


        assertEquals("David Abayomi", result.getName());
        assertEquals(25, result.getAge());
        assertEquals(Gender.MALE, result.getGender());
        assertEquals(Role.SENIOR_STUDENT, result.getRole());
    }
}