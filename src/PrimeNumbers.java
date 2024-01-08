import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);

System.out.println("Enter a number and we will determine whether it is a prime number or not!");
int num = in.nextInt();

boolean Prime = true;

if (num <= 1) {
    Prime = false;
} else {
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            Prime = false;
            break;
        }
    }
}

if (Prime) {
    System.out.println(num + " is a prime number!");
} else {
    System.out.println(num + " is not a prime number.");
}

in.close();
}

	}
