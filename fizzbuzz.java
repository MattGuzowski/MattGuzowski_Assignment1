
/**
 * CIS_365_Assignment_1
 *
 * @author Matt Guzowski
 */
import java.util.ArrayList;

public class fizzbuzz {

    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
