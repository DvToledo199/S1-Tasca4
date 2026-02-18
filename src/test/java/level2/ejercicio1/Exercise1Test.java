package level2.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise1Test {
    @Test
    void shouldCompareIntegerValues() {

        Integer number1 = 10;
        Integer number2 = 10;
        Integer number3 = 20;

        assertThat(number1).isEqualTo(number2);
        assertThat(number1).isNotEqualTo(number3);
    }

}
