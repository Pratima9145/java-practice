import java.util.Scanner;
class Laballocation{
	public static void main(String...arg) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter x");
		int x=Integer.parseInt(s.nextLine());
		System.out.println("Enter y");
		int y=Integer.parseInt(s.nextLine());
		System.out.println("Enter z");
		int z=Integer.parseInt(s.nextLine());
		
		if(x<y && y<2) {
			System.out.println("L1 has minimal seating capacity");
		}
		else if(y<z) {
			System.out.println("L2 has minimal seating capacity");
		}
		else {
			System.out.println("L3 has minimal seating capacity");
		}
	}
}