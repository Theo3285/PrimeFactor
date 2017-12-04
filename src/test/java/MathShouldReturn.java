import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathShouldReturn {
    @Test
    public void firstPrimeNumber() {
        assertEquals(2, Math.next(1));
    }

    @Test
    public void secondPrimeNumber() {
        assertEquals(3, Math.next(2));
    }

    @Test
    public void thirdPrimeNumber() {
        assertEquals(5, Math.next(4));
    }

    @Test
    public void tenthPrimeNumber() {
        assertEquals(29, Math.next(23));
    }
}
