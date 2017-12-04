import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        MathShouldReturn.class,
        PrimeFactorShouldReturn.class,
        RendererShouldReturn.class
})
public class PrimeFactorSuite {
}
