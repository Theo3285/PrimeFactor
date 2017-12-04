import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Please enter a number: ");
        long num = scan.nextLong();
        Renderer renderer = new StringRenderer();
        System.out.println("Prime factors of " + num + " are:");
        System.out.println(renderer.renderPrimeFactorsOf(num));
    }
}
