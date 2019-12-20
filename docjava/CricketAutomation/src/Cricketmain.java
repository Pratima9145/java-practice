import java.util.*;

public class Cricketmain {

       public static void main(String[] args) {
              Scanner s = new Scanner(System.in);
              Delivery del = new Delivery();

              System.out.println("Menu \n1.Player details of the delivery \n" + "\n" + "2.Run details of the delivery ");
              int opt = Integer.parseInt(s.nextLine());

              switch (opt) {
              case 1:
                     if (opt == 1) {
                           System.out.println("Enter the bowler name ");
                           String bowl = s.nextLine();

                           System.out.println("Enter the batsman name ");
                           String bat = s.nextLine();

                           del.displayDeliveryDetails(bowl, bat);
                           break;
                     }
              case 2:
                     if (opt == 2) {
                           System.out.println("Enter the number of runs ");
                           long run = Long.parseLong(s.nextLine());
                           del.displayDeliveryDetails(run);
                           if (run == 6) {
                           
                                  System.out.println("It is a Sixer.");

                           } else if (run == 4) {
                                  
                                  System.out.println("It is a boundary.");
                     }
                           	break;
                     }
              default:
                     System.out.println("Invalid Data");
                     break;
              }

       }

}

