package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.*;

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

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        System.out.println("test repeat");
    }

    @RepeatedTest(5)
    void myRepeatedTestWithID(TestInfo testInfo, RepetitionInfo repetitionInfo,) {
        System.out.println(testInfo.getDisplayName() + ":" + repetitionInfo.getCurrentRepetition());
    }
}