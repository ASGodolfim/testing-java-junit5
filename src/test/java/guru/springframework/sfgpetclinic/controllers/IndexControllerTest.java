package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;
    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test Proper View Name")
    @Test
    void index() {
        assertEquals("index", controller.index(), "view error");

    }

    @DisplayName("Test Exeption")
    @Test
    void oopsHandler() {
        assertThrows(ValueNotFoundExeption.class, () -> {
            controller.oopsHandler();
        });
    }

    @Disabled("Demo TimeOut")
    @Test
    void testTimeOut(){

        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);
            System.out.println("I got Here");
        });
    }

    @Disabled("Demo TimeOut")
    @Test
    void testTimeOutPremp(){

        assertTimeoutPreemptively(Duration.ofMillis(100), () ->{
            Thread.sleep(5000);
            System.out.println("I got Here 2");
        });
    }
}