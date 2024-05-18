import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class parityCheck {

    @Test
    void findEvenNumber_validArray_success() {
        // given
        int[] numbers = {5, 9, -10, 8, 185};

        // when
        int result = Main.evenParity(numbers);

        // then
        Assertions.assertEquals(0, result);
    }
}
