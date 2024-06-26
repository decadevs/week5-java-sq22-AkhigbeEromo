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

    @Override
    public String returnBook(String nameOfBook, List<Book> books, Person user) {
        for(Book b: books){
            if(nameOfBook.equals(b.getName())){
                b.setNumberOfCopies(b.getNumberOfCopies()+1);
                System.out.println(user.getName()+ " has returned " +b.getName() +" to the Library");
                return nameOfBook;
            }
        }

        return nameOfBook+ "does not belong to this library";
    }
}
