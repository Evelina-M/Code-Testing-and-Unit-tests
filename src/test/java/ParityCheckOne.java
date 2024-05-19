import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParityCheckOne {

    @Test
    void findEvenNumber_validArray_success() {
        // given
        int[] numbers = {1, 3, 5, 7, 9};

        // when
        int result = Main.evenParity(numbers);

        // then
        Assertions.assertEquals(0, result);
    }
}
