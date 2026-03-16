package level2.ejercicio4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise4Test {

    @Test
    void shouldValidateArrayListContentAndOrder() {

        List<Object> list = new ArrayList<>();

        String text = "Hello";
        Integer number = 42;
        Double decimal = 3.14;

        list.add(text);
        list.add(number);
        list.add(decimal);

        assertThat(list).containsExactly(text, number, decimal);

        assertThat(list).containsExactlyInAnyOrder(decimal, text, number);

        assertThat(list).containsOnlyOnce(text);

        assertThat(list).doesNotContain("NotAdded");
    }
}