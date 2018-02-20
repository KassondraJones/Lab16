import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kassie Jones
 *
 */
public class PrimeNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userPrime;
		String cont = "y";

		System.out.println("Let's locate some primes!");
		System.out.println("\nThis application will find you any prime, in order, from first prime number on.");

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Which prime number are you looking for?");
			userPrime = scan.nextInt();
			scan.nextLine();

			System.out.println("You have selected the #" + userPrime + " prime in the sequence of prime numbers.");

			int seqPrime = findPrime(userPrime);

			System.out.println("The #" + userPrime + " prime number in the sequence is " + seqPrime + ".");

			System.out.println("Do you want to find another prime number?  (y / n)");
			cont = scan.nextLine();

		}

		System.out.println();
		System.out.println("Ok, goodbye!");

		scan.close();
	}

	public static int findPrime(int userPrime) {
		// found on Mkyong
		boolean[] list = new boolean[1000]; // creating boolean list assuming all values are prime
		Arrays.fill(list, true);

		list[0] = false; // Overriding for known non-prime numbers at beginning of list
		list[1] = false;

		ArrayList<Integer> primes = new ArrayList<Integer>(); // create list of prime numbers from boolean list whose
																// values remain true

		for (int i = 2; i < list.length; i++) { // iterate through boolean list
			if (list[i]) { // if value is true

				for (int j = 2; i * j < list.length; j++) { // iterate that same list and make it's multiples false
															// starting at 2 since we know 0 and 1 are not prime
					list[i * j] = false;
				}
				primes.add(i); // add the left over values to the prime array list
			}
		}

		return primes.get(userPrime - 1); // adjusting for index from length
	}

}
