package level2.ejercicio2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise2Test {

    @Test
    void shouldCompareObjectReferences() {

        String text1 = new String("Hello");
        String text2 = text1;
        String text3 = new String("Hello");

        assertThat(text1).isSameAs(text2);
        assertThat(text1).isNotSameAs(text3);
    }
}