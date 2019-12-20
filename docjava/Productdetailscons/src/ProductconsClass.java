import java.util.Scanner;

public class ProductconsClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Productcons pc=new Productcons(1,"Printer","HP");
		
		System.out.println("Enter the Product Id");
		long Id=Long.parseLong(s.nextLine());
		
		System.out.println("Enter the Product Name");
		String  Pname=s.nextLine();
		pc.setProductName(Pname);
		
		System.out.println("Enter the Supplier Name");
		String  Sname=s.nextLine();
		pc.setSupplierName(Sname);
		
		pc.display();
	}

}
