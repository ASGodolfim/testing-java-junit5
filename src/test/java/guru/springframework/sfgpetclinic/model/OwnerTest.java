package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void  dependentAssertions(){

        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("12341234234");

        assertAll("Properties Test"
            () -> assertAll("Person Properties",
                () -> assertEquals("Joe", owner.getFirstName(), "First Name Fail"),
                () -> assertEquals("Buck", owner.getLastName(), "Last Name Fail")),
            () -> assertAll("Owner Properties",
                    () -> assertEquals("Key West", owner.getCity(), "City Name Fail"),
                    () -> assertEquals("12341234234", owner.getTelephone(), "Telephone Fail")
            ));
    }

}