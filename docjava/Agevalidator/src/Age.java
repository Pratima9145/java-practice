import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = Integer.parseInt(s.nextLine());

		try {
			if (age < 18) {
				System.out.print("Exception occurd");
				throw new AgeException(" InvalidAgeException:not valid");
			} else
				System.out.println("welcome to vote");
		} catch (AgeException a) {
			System.out.println();
		}
	}

}
