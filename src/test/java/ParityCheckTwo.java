import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParityCheckTwo {

    @Test
    void findEvenNumber_validArray_success() {
        // given
        int[] numbers = {2, 4, 6, 8, 10};

        // when
        int result = Main.evenParity(numbers);

        // then
        Assertions.assertEquals(0, result);
    }
}
