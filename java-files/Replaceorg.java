import java.util.Scanner;
class Replaceorg {
	public static void main(String...arg) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the content of document");
		String x=s.nextLine();
		
		System.out.println("Enter the old name of the company");
		String y=s.nextLine();
		
		System.out.println("Enter the new name of the company");
		String z=s.nextLine();
		
		String cont=x.replace(y,z);
		System.out.println("The content of the modified document is \n" +cont);
	}
}
		