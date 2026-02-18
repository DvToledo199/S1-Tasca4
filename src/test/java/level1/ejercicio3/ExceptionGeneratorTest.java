package level1.ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionGeneratorTest {

    @Test
    void generateExceptionShouldThrowArrayIndexOutOfBoundsException() {

        ExceptionGenerator generator = new ExceptionGenerator();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            generator.generateException();
        });
    }
}
