import models.Books;
import services.impls.BookServiceImpl;
import services.impls.LibraryServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    public static void main(String[] args) {


//        for(Books book:books){
//            System.out.print(book.getName());
//            System.out.print(book.getId());
//            System.out.print(book.getAuthor());
//            System.out.print(book.getYearPublished());
//            System.out.println();
//        }
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.giveBookByPriority("Living Dangerously");
        libraryService.giveBookByOrder("Things fall Apart");
//        BookServiceImpl bookService = new BookServiceImpl();
//        bookService.checkBookIsRemaining("Things fall part");
    }
}
