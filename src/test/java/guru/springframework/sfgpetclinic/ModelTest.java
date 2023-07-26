package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;


@Tag("model")
public interface ModelTest {

    @BeforeEach
    default void beforeEachOutputter(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println("Running Test - "
                + testInfo.getDisplayName());

    }
}
