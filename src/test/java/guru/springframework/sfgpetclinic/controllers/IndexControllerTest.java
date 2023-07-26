package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.ControllerTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


class IndexControllerTest implements ControllerTest {

    IndexController controller;
    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test Proper View Name")
    @Test
    void index() {
        assertEquals("index", controller.index(), "view error");
        assertThat(controller.index()).isEqualTo("index");
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

    @Test
    void testAssumptionTrueAssumpIsTrue() {

        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }
    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS() {
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindows() {
    }
    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8() {
    }
    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "Arthur")
    @Test
    void testIfUserArthur() {
    }
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Fred")
    @Test
    void testIfUserFred() {
    }
}