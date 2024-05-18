import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class parityСheckHamcrestTwo {

    @Test
    void testEvenParity_printsOnlyEvenNumbers_success() {
        // given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // when
        int result = Main.evenParity(numbers);

        // then
        Matchers.containsString(String.valueOf(2));
        Matchers.containsString(String.valueOf(4));
        Matchers.containsString(String.valueOf(6));
        Matchers.containsString(String.valueOf(8));
        Matchers.containsString(String.valueOf(10));


    }
}
