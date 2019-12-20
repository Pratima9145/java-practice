import java.util.*;
class Profitlossmeth {
	public static void main(String...arg) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of toys purchased");
		int x=s.nextInt();
		
		System.out.println("Enter the price per dozen");
		int y =s.nextInt();
		
		System.out.println("Enter the selling price of 1 toy");
		int z=s.nextInt();
		
		Calc c=new Calc();
		float profit=c.calculateProfit(x,y,z);
		
		System.out.printf("Sam's profit percentage is %.2f",profit,"percent");
	}
}
	