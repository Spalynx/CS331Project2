
/** This class is a subclass of Pizza Order, simply adds helper
 *  methods to the class.
 *
 * @todo javadocs all the sub classes.
 *
 * @author Spalynx
 * @since 22 Mar. 2016
 */
public class C5Question8 extends PizzaOrder{
    // Default constructor, calls super default constructor.
    C5Question8() {
        super();
    }
    // Integer parameter constructor, calls super(int) constructor
    C5Question8(int num){
        super(num);
    }
    // Copy constructor, moves the pizzas from the param to this class.
    C5Question8(PizzaOrder p){
        int num = p.getPizzas().length;
        if(num >= 1){
            setPizza1(p.getPizzas()[0]);
        }
        if(num >= 2){
            setPizza2(p.getPizzas()[1]);
        }
        if(num == 3){
            setPizza3(p.getPizzas()[2]);
        }
    }

    // Gets the number of pizzas used.
    public int getNumPizzas(){
        return num_pizzas;
    }

    //Accessors for the pizzas in the Pizza Order
    public Pizza getPizza1()    {
        return getPizzas()[0];  }
    public Pizza getPizza2()    {
        return getPizzas()[1];  }
    public Pizza getPizza3()    {
        return getPizzas()[2];  }


}

