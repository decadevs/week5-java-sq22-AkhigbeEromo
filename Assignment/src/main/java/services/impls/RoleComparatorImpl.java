package services.impls;

import enums.Role;
import models.Person;

import java.util.Comparator;

public class RoleComparatorImpl implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getRole().equals(Role.TEACHER)){
            return -1;
        } else if (p1.getRole().equals(Role.SENIOR_STUDENT)) {
            return 0;
        }else{
            return 1;
        }

    }
}
