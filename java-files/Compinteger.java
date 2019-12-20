import java.util.Scanner;
class Compinteger {
	public static void main(String...arg) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int first=Integer.parseInt(s.nextLine());
		System.out.println("Enter the second number");
		int second=Integer.parseInt(s.nextLine());
		
		if(first<second ) {
			System.out.println(first+ " is less than " +second);
		}
		else if(first==second) {
			System.out.println(first+ " is equal to " +second);
		}
		else if(first>second) {
			System.out.println(first+ " is greater than " +second);
		}
		else {
			System.out.println("Enter a number");
		}
	}
}