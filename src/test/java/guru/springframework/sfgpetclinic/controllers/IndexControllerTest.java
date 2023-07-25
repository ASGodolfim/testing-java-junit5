package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}