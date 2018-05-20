package boot2junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    void name() {
        assertEquals(1 + 1, 2);
    }
}
