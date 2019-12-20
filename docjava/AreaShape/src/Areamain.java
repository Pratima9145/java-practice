import java.util.Scanner;

public class Areamain {

		public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("1. Rectangle");
		System.out.println("2. Square");
		System.out.println("3. Circle");
		System.out.println("Area Calculator --- Choose your shape");
		
		int opt=Integer.parseInt(s1.nextLine());
		Shape shape=null;
		
		if(opt==1) {
			System.out.print("Enter length and breadth: ");
			int length = s1.nextInt();
			int breadth = s1.nextInt();
			shape=new Rectangle(length,breadth);
		}
		else if(opt==2) {
			System.out.println("Enter the side");
			int side=Integer.parseInt(s1.nextLine());
			shape=new Square(side);
		}
		else if(opt==3) {
			System.out.println("Enter the radius");
			int radius=Integer.parseInt(s1.nextLine());
			shape=new Circle(radius);
		}
		
		System.out.printf("Area of %s is : %.2f",shape.getShapeName(),shape.calculateArea());
	}

}


