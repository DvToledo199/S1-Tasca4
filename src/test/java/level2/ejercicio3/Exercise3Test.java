package level2.ejercicio3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise3Test {

    @Test
    void shouldCompareIntegerArrays() {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        assertThat(array1).isEqualTo(array2);
    }
}