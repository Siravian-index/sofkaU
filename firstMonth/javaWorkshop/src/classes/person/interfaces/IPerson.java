package classes.person.interfaces;

import classes.person.enums.Gender;

public interface IPerson {
    int calculateBMI();
    boolean isAdult();
    String toString();
    int generateDNI();
}
