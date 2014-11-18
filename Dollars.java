import java.util.Scanner;
public class Dollars {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int quarter;
		int dime;
		int nickel;
		int penny;
		float dollar;
		float cents;

		System.out.println("How many quarters do you have?: ");
		quarter=in.nextInt();

		System.out.println("How many dimes do you have?: ");
		dime=in.nextInt();

		System.out.println("How many nickels do you have?: ");
		nickel=in.nextInt();

		System.out.println("How many pennies do you have?: ");
		penny=in.nextInt();

		float quarterToCent=(float) (quarter*(25));
		float dimeToCent=(float) (quarter*(10));
		float nickelToCent=(float) (quarter*(5));

		cents=quarterToCent + dimeToCent + nickelToCent;

		dollar=cents  /100;

		System.out.println("You have " +dollar + " dollars.");

	}
}
