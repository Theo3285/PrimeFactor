import org.junit.Assert;
import org.junit.Test;

public class RendererShouldReturn {

    @Test
    public void stringOfPrimeFactors() {
        Renderer renderer = new StringRenderer();
        Assert.assertEquals("240 = 2x2x2x2x3x5", renderer.renderPrimeFactorsOf(240));
    }
}
