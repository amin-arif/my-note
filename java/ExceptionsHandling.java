import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsHandling {

    // throws keyword example
    public static void calculation(int num1, int num2) throws ArithmeticException {
        System.out.println("\nThrows keyword:");
        System.out.println(num1 / num2);
    }

    // throw keyword example
    public static void show() {
        System.out.println("\nThrow keyword: ");
        throw new ArithmeticException("Divide by zero");
    }

    public static void readFile() {
        String line =  "";

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Arithmetic Exception
        try {
            int divideByZero = 9 / 0;

            System.out.println(divideByZero);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception => " + e.getMessage());
        } finally {
            System.out.println("Final block.");
        }

        // throws keyword
        // ExceptionsHandling.calculation(5, 0);

        // throw keyword
        // ExceptionsHandling.show();

        readFile();
    }
}
