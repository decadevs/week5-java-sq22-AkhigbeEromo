package services;

import models.Books;

public interface BookService {
    Books checkBookIsRemaining(String nameOfBook);
}
