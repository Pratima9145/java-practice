import java.util.Scanner;

public class GenC {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		Displaygen n=new Displaygen(969143,"John");
		Displaygen n1=new Displaygen(969144,"Priya");
				
		System.out.println("Enter the number of GenCs");
		int gen=Integer.parseInt(s.nextLine());
		
		for(int i=0;i<gen;i++) {
			System.out.println("Enter the employee Id");
			int empId=Integer.parseInt(s.nextLine());
			n.setEmpId(empId);
			
			System.out.println("Enter the name");
			String name=s.nextLine();
			n1.setName(name);
		}
			n.display();
			n1.display();
		}
	}


