import java.util.Scanner;
class Profitloss {
	public static void main(String...arg) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of dozens of toys purchased");
		int x=s.nextInt();
		
		System.out.println("Enter the price per dozen");
		int y=s.nextInt();
		
		System.out.println("Enter the selling price of 1 toy");
		int z=s.nextInt();
		
		
		
		double costprice=y/12d;
		double profit=z-costprice;
		double profitPer=(profit/costprice)*100;
		System.out.println("Sam's profit percentage is "+profitPer+" percent");
	}
}