package level1.ejercicio2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcularDNITest {
    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "00000000, T",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B",
            "88888888, Y"

    })
    void calculateDniLetterShouldReturnCorrectLetter(int dniNumber, char expectedLetter) {

        char result = CalculateDNI.calculateDniLetter(dniNumber);

        assertEquals(expectedLetter, result);
    }
    @Test
    void calculateDniLetterShouldThrowExceptionForInvalidNumbers() {

        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDNI.calculateDniLetter(-1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDNI.calculateDniLetter(100000000);
        });
    }
}
