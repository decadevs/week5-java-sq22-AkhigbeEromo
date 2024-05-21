package services.impls;

import models.Books;
import services.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    @Override
    public Books checkBookIsRemaining(String nameOfBook) {
        List<Books> books = new ArrayList<>();
        books.add(new Books(1, "Things fall Apart", "Chinua Achebe", 1990));
        books.add(new Books(2, "the gods are mad", "Felix Achebe", 1996));
        books.add(new Books(3, "Beautiful ones are not yet born", "Caro White", 2020));
        books.add(new Books(4, "The Eternals", "Charles Wright", 2012));
        books.add(new Books(5, "Living Dangerously", "Darry Light", 2023));
        int count =0;

        Books bookRemains = null;
        for (Books b : books) {
            if (b.getName().equals(nameOfBook)) {
                bookRemains = b;
//                System.out.println(b);
             count++;
            }
        }
        if (count == 0){
            System.out.println(nameOfBook + " is not available at the moment, try again later");
        }

        return bookRemains;

    }
}
