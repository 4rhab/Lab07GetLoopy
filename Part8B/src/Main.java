// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        do {
            System.out.println("Enter the temperature in Fahrenheit: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Not a valid temperature. Please re-enter.");
                scanner.next();
            }
            fahrenheit = scanner.nextDouble();
        } while (fahrenheit < -459.67); //used Google to find the minimum temp, wasn't sure how else to format it

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in Celsius is: " + celsius);
    }
}
