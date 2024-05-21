import models.Books;
import services.impls.BookServiceImpl;
import services.impls.LibraryServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.giveBookByPriority("Living Dangerously");
        libraryService.giveBookByOrder("Things fall Apart");
    }
}
