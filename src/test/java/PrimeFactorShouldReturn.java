import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorShouldReturn {

    private Factor factor;

    @Before
    public void setUp() {
        factor = new PrimeFactor();
    }

    @Test
    public void primeFactorsOf240() throws Exception {
        List<Long> expected = new LinkedList<Long>();
        expected.add(2L);
        expected.add(2L);
        expected.add(2L);
        expected.add(2L);
        expected.add(3L);
        expected.add(5L);
        assertEquals(expected, factor.find(240));
    }

    @Test(expected=InvalidNumberException.class)
    public void anExceptionWithNegativeNumber() throws InvalidNumberException {
        factor.find(-1);
    }
}
