import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class parityСheckHamcrestOne {

    @Test
    void testEvenParity_printsOnlyEvenNumbers_success() {
        // given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // when
        int result = Main.evenParity(numbers);

        // then
        assertThat(result, is(0));

    }
}
