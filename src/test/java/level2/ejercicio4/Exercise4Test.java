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

        // Verify exact order
        assertThat(list).containsExactly(text, number, decimal);

        // Verify contains in any order
        assertThat(list).containsExactlyInAnyOrder(decimal, text, number);

        // Verify appears only once
        assertThat(list).containsOnlyOnce(text);

        // Verify does not contain an element not added
        assertThat(list).doesNotContain("NotAdded");
    }
}