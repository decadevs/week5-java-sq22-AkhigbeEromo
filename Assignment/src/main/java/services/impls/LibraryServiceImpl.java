package services.impls;

import enums.Gender;
import enums.Role;
import models.Person;
import services.LibraryService;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class LibraryServiceImpl implements LibraryService {
    BookServiceImpl bookService = new BookServiceImpl();
    @Override
    public Person giveBookByPriority(String book) {
        PriorityQueue<Person>queue = new PriorityQueue<>(new RoleComparatorImpl());
        queue.add(new Person("David Abayomi", 25, Gender.MALE,Role.SENIOR_STUDENT));
        queue.add(new Person("Veronica Adason", 30, Gender.FEMALE, Role.JUNIOR_STUDENT));
        queue.add(new Person("Eromosele Akhigbe",23, Gender.MALE,Role.TEACHER));
        ;

        Person borrower = queue.poll();
        assert borrower != null;
        System.out.println(borrower.getName() +" has borrowed the book with the following details: " + bookService.checkBookIsRemaining(book));

        return borrower;
    }

    @Override
    public Person giveBookByOrder(String book) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("David Abayomi", 25, Gender.MALE,Role.SENIOR_STUDENT));
        list.add(new Person("Veronica Adason", 30, Gender.FEMALE, Role.JUNIOR_STUDENT));
        list.add(new Person("Eromosele Akhigbe",23, Gender.MALE,Role.TEACHER));
        System.out.println(list.get(0).getName()+ " has borrowed the book with the following details: "+ bookService.checkBookIsRemaining(book) );
       return list.get(0);
    }
}
