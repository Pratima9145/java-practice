import java.awt.AWTException;
import java.util.Scanner;

public class Dividenumbers {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter 2 Numbers");
			int a = Integer.parseInt(sc.nextLine());
			int b = Integer.parseInt(sc.nextLine());
			int c = a / b;
			System.out.println("The quotient of " + a + "/" + b + " = " + c);
		} catch (ArithmeticException e) {
			System.out.println("DivideByZeroException caught");
		} finally {
			System.out.println("Inside finally block");
		}

	}

}
