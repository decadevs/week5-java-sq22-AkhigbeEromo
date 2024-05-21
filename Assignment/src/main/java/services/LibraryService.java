package services;

import models.Person;

public interface LibraryService {
    Person giveBookByPriority(String nameOfBook);
    Person giveBookByOrder(String nameOfBook);
}
