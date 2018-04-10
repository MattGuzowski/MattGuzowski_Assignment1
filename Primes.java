
/**
 * CIS_365_Assignment_1
 *
 * @author Matt Guzowski
 */
public class Primes {

    public static void main(String[] args) {
        long primeCounter = 0;
        long desiredPrime = 10000;
        long i = 0;
        long primeResult = 0;

        while (primeCounter <= desiredPrime) {
            if (isPrime(i)) {
                primeCounter++;
                if (primeCounter == desiredPrime) {
                    primeResult = i;
                }
            }
            i++;
        }
        System.out.println("The number '" + primeResult + "' is the number '"
                + desiredPrime + "' in the list of prime numbers");
    }

    private static boolean isPrime(long x) {
        if (x < 2) {
            return false;
        }
        for (long i = 2; i * i <= x; i++) { 
            if (x % i == 0) { 
                return false;
            }
        }
        return true;
    }

}
