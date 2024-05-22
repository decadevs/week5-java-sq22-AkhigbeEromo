package services.impls;

import models.Book;
import models.Person;
import services.LibraryService;

import java.util.List;

import static models.Library.libraryUsersOnPriorityQueue;
import static models.Library.libraryUsersOnQueue;

public class LibraryServiceImpl implements LibraryService {
    BookServiceImpl bookService = new BookServiceImpl();
    @Override
    public String addLibraryUsersToPriorityQueue(Person user) {
        libraryUsersOnPriorityQueue.add(user);
        return user.getName();
    }

    @Override
    public String addLibraryUsersToQueue(Person user) {
        libraryUsersOnQueue.add(user);
        return user.getName();
    }

    @Override
    public String giveBookByPriority(String book, List<Book>books) {
        String result ="";
            for(Person p:libraryUsersOnPriorityQueue){
                if(bookService.checkBook(book,books) != null) {
                    System.out.println(p.getName() + " has borrowed " + book);
                    result = book;
                }else {
                    System.out.println(p.getName()+ " cannot borrow "+ book+ " because it is not available");
                }
            }
            return result;

    }

    @Override
    public String giveBookByOrder(String book, List<Book>books) {
        String result ="";
        for(Person p:libraryUsersOnQueue){
            if(bookService.checkBook(book,books) != null) {
                System.out.println(p.getName() + " has borrowed " + book);
                result = book;
            }else {
                System.out.println(p.getName()+ " cannot borrow "+ book+ " because it is not available");
            }
        }
        return result;
    }
}
