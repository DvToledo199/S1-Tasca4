package level2.ejercicio5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise5Test {

    @Test
    void shouldVerifyMapContainsKey() {

        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        assertThat(map).containsKey("banana");
    }
}