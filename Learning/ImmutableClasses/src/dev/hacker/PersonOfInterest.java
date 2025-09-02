package dev.hacker;

import dev.lpa.Person;
import dev.lpa.PersonImmutable;

public class PersonOfInterest extends PersonImmutable {

    public PersonOfInterest(PersonImmutable person) {
        super(person);
    }

}
