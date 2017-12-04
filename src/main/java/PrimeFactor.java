import java.util.LinkedList;
import java.util.List;

public class PrimeFactor implements Factor {

    private List<Long> getPrimeFactors(long number) throws InvalidNumberException{
        if (number < 1) {
            throw new InvalidNumberException("Number must positive");
        }

        List<Long> factors = new LinkedList<Long>();
        long prime = 2;
        long next = number;

        while (next != 1) {
            if (next % prime == 0) {
                factors.add(prime);
                next = next / prime;
            } else {
                prime = Math.next(prime);
            }
        }

        return factors;
    }

    public List<Long> find(long number) throws InvalidNumberException {
        return this.getPrimeFactors(number);
    }
}
