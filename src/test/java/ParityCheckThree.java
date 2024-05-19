import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class ParityCheckThree {

    @Test
    void findEvenNumber_validArray_success() {
        // given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // when + then
        assertDoesNotThrow(() -> Main.evenParity(numbers));
    }
}
