/** CS331Project2
 * Created by Mark Eikel on 3/22/2016.
 * @author Mark Eikel
 * @since 22 Mar. 2016
 */
public class Main {
    public static void main(String [] args){
        System.out.println("Hello World!");
        System.out.println("Does this work");

        PizzaOrder p = new PizzaOrder(1);
        //-------length is 1
        p.setPizza1(new Pizza(1,2,3,1));
        p.setPizza2(new Pizza(1,1,2,3));

        //-------length is 3
        C5Question8 c = new C5Question8(p);
        c.setPizza3(new Pizza(1,1,1,1));
        System.out.println(c + "\n" + c.getTotal());

        //TODO: implement the main method actions in C5Q8.
        //TODO: implement the main method actions in C5Q4.
    }
}