package level2.ejercicio7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise7Test {

    @Test
    void shouldVerifyOptionalIsEmpty() {

        Optional<String> optional = Optional.empty();

        assertThat(optional).isEmpty();
    }
}