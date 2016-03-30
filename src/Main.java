import java.util.Scanner;

/** CS331Project2
 * Created by Mark Eikel on 3/22/2016.
 * @author Mark Eikel
 * @since 22 Mar. 2016
 */

public class Main {
    public static void main(String [] args) {
        System.out.println("Hello World!");
        System.out.println("Does this work");

        System.out.print("For Question 4 press: 4\nFor Question 8 press: 8\nTo quit the Application press: 0");
        Scanner input = new Scanner(System.in);
        int choice;
        choice = input.nextInt();

        do{
            System.out.print("For Question 4 press: 4\nFor Question 8 press: 8\nTo quit the Application press: 0\n");
            choice = input.nextInt();
            if (choice == 4) {
                /* Call Team and Competition class */
                Competition myCompetition = new Competition();
                Competition myCompetition2 = new Competition();
                Team myTeam = new Team();
                System.out.println("Enter in your team name:");
                myTeam.setTeamName(input.nextLine());
                System.out.println("Enter team members 1 name:");
                myTeam.setName1(input.nextLine());
                System.out.println("Enter team members 2 name:");
                myTeam.setName2(input.nextLine());
                System.out.println("Enter team members 3 name:");
                myTeam.setName3(input.nextLine());
                System.out.println("Enter team members 4 name:");
                myTeam.setName4(input.nextLine());


                myTeam.setCompetition1(myCompetition);
                myTeam.setCompetition2(myCompetition);

            } else if (choice == 8) {
                /* Call pizza class */
            } else if (choice == 0) {
                choice = 0;
            } else {
                System.out.print("This isn't a valid option enter a valid option next time.");
            }
        } while( choice != 0 );

        /*PizzaOrder p = new PizzaOrder(1);
        //-------length is 1
        p.setPizza1(new Pizza(1,2,3,1));
        p.setPizza2(new Pizza(1,1,2,3));
        System.out.println(p.num_pizzas);

        //-------length is 3
        C5Question8 c = new C5Question8(p);
        System.out.println( c );*/

        //TODO: implement the main method actions in C5Q8.
        //TODO: implement the main method actions in C5Q4.
    }
}