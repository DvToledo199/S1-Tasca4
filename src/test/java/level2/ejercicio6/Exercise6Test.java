package level2.ejercicio6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Exercise6Test {

    @Test
    void shouldThrowArrayIndexOutOfBoundsException() {

        assertThatThrownBy(() -> {
            int[] numbers = new int[2];
            int value = numbers[5];
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}