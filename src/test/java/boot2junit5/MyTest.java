package boot2junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    void sample() {
        assertEquals(1 + 10, 11);
    }
}
