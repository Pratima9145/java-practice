import java.util.Scanner;
class Secureurl {
	public static void main(String...arg) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String x=s.nextLine();
		
		System.out.println("Enter the start string");
		String y=s.nextLine();
		if(x.startsWith(y)) {
			System.out.println(x+"Start with 'https'");
		}
		else {
			System.out.println(x+"Does not start with 'https'");
		}
	}
}
		