import java.util.Scanner;

public class Power_Calculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter base: ");
		double base = scanner.nextDouble();
		System.out.print("Enter exponent: ");
		double exponent = scanner.nextDouble();
		double result = Math.pow(base, exponent);
		System.out.println(base + " raised to the power " + exponent + " is: " + result);
		scanner.close();
	}
}
