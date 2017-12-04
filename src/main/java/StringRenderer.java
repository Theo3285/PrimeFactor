import java.util.List;

public class StringRenderer implements Renderer {

    public String renderPrimeFactorsOf(long aNumber) {

        String renderedValue = String.valueOf(aNumber) + " = ";
        Factor factor = new PrimeFactor();

        try {
            List<Long> results = factor.find(aNumber);
            int i = 0;
            for (long result : results
                    ) {
                renderedValue += String.valueOf(result);
                if (i++ < results.size() - 1) {
                    renderedValue += "x";
                }
            }
        } catch (InvalidNumberException ex) {
            ex.printStackTrace();
        }

        return renderedValue;
    }
}
