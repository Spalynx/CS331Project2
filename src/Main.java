/** CS331Project2
 *  Allows the user the option of which program segment
 *  to run test solutions on.
 * @author Mark Eikel
 * @author Brandon Hathaway
 * @since 22 Mar. 2016
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        try{
            do{
                System.out.println("Options:\n\t0. Quit\n\t1. Question 4\n\t2. Question 8");
                System.out.print("Choose one: ");
                    choice = Integer.parseInt(input.next());
                    input.nextLine();
                System.out.println();

                if (choice == 1) {
                    /* Call Team and Competition class */
                    /* Assigns values to the Team class */
                    Competition myCompetition = new Competition();
                    Team myTeam = new Team();

                    System.out.println("\nEnter in your team name:");
                    myTeam.setTeamName(input.nextLine());

                    System.out.println("\nEnter team members 1 name:");
                    myTeam.setName1(input.nextLine());
                    System.out.println("\nEnter team members 2 name:");
                    myTeam.setName2(input.nextLine());
                    System.out.println("\nEnter team members 3 name:");
                    myTeam.setName3(input.nextLine());
                    System.out.println("\nEnter team members 4 name:");
                    myTeam.setName4(input.nextLine());

                    /* Assigns values to all of the Competitions */
                    System.out.println("\nEnter the competition name:");
                    myCompetition.setCompetition_name(input.nextLine());
                    System.out.println("\nEnter the competition's winning team:");
                    myCompetition.setWinning_team(input.nextLine());
                    System.out.println("\nEnter the competition's runner up:");
                    myCompetition.setRunner_up(input.nextLine());
                    System.out.println("\nEnter the year of the competition:");
                    myCompetition.setCompetition_year(input.nextInt());

                    /* implements copy constructor */
                    Competition myCompetition2 = new Competition(myCompetition);

                    myTeam.setCompetition1(myCompetition);
                    myTeam.setCompetition2(myCompetition2);

                    /* implements deep copy constructor */
                    Team myTeam2 = new Team(myTeam,true);

                    System.out.println(myTeam2.printTeamsMembers(myTeam2));
                    System.out.println(myCompetition2.printCompetition());

                } else if (choice == 2) {
                    //Inits a new pizza order with size of 1.
                    PizzaOrder p = new PizzaOrder(1);
                    Random ran = new Random();

                    //Fills first pizza with a random pizza.
                    p.setPizza1(new Pizza(ran.nextInt(2)+1,ran.nextInt(4),ran.nextInt(4),ran.nextInt(4)));

                    //Fills the second one(auto expands to two pizzas.
                    p.setPizza2(new Pizza(ran.nextInt(2)+1,ran.nextInt(4),ran.nextInt(4),ran.nextInt(4)));

                    //Initializes a C5Q8 class with a pizza order.
                    C5Question8 c = new C5Question8(p);

                    //And it outputs the data.
                    System.out.println( c );

                    System.out.println("Total cost of pizzas: " + c.getCost());

                //if you enter something wrong
                } else if (choice != 0) {
                    System.out.print("This isn't a valid option enter a valid option next time.");
                }

                System.out.println("\n-----------------------------\n");
            } while( choice != 0 );

            System.out.println("Exiting program...");
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        input.close();
    }
}