package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest implements ModelTest {

    @Test
    void groupedAssertions(){
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe", "First Name Fail"),
                () -> assertEquals(person.getLastName(), "Buck", "Last Name Fail")
        );
    }

}