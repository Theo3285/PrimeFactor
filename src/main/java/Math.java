public class Math {
    public static long next(long aNumber) {
        long next = aNumber + 1;
        if (isPrime(next)) {
            return next;
        }
        return next(next);
    }

    private static boolean isPrime(long aNumber) {
        for (long i = 2; i < aNumber; i++) {
            if (aNumber % i == 0)
                return false;
        }
        return true;
    }
}
