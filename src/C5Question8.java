/** This class is a subclass of Pizza Order, simply adds helper
 *  methods to the class.
 *
 * @author Mark Eikel
 * @author Brandon Hathaway
 * @since 22 Mar. 2016
 */
public class C5Question8 extends PizzaOrder{

    /** Default constructor, calls super default constructor.
     */
    C5Question8() {
        super();
    }
    /** Integer parameter constructor, calls super(int) constructor.
     * @see PizzaOrder#PizzaOrder(int)
     * @param num number of pizzas to have in the pizza order.
     */
     C5Question8(int num){
        super(num);
    }
    /** Copy constructor, moves the pizzas from the param to this class.
     *  Starts by initializing with the super(int) constructor, and setting
     *  the internal pizzas with setters.
     * @see PizzaOrder#PizzaOrder(int)
     * @see PizzaOrder#setPizza1(Pizza)
     * @param p The PizzaOrder variable to be copied into this.
     */
     C5Question8(PizzaOrder p){
        super(p.num_pizzas); //value given constructor.

        if(num_pizzas >= 1){
            setPizza1(p.getPizzas()[0]);
        }
        if(num_pizzas >= 2){
            setPizza2(p.getPizzas()[1]);
        }
        if(num_pizzas == 3){
            setPizza3(p.getPizzas()[2]);
        }
    }



    /** Gets the number of pizzas in this PizzaOrder.
     * @return number of pizzas in PizzaOrder.
     */
    public int getNumPizzas(){
        return num_pizzas;
    }
    /** Gets the pizza in the 1st value of the pizzas array.
     * @return pizza #1 from pizzas array
     */
    public Pizza getPizza1()    {
        return getPizzas()[0];  }
    /** Gets the pizza in the 2nd value of the pizzas array.
     * @return pizza #1 from pizzas array.
     */
    public Pizza getPizza2()    {
        return getPizzas()[1];  }
    /** Gets the pizza in the 3rd value of the pizzas array.
     * @return pizza #3 from pizzas array.
     */
    public Pizza getPizza3()    {
        return getPizzas()[2];  }



    /** Gets all of the descriptions from the Pizza objects
     *  within the super PizzaOrder class.
     * @see Pizza#getDescription()
     * @return a string with all of the pizza descriptions.
     */
    public String toString(){
        String description = "";

        //Getting a description for each pizza and adding to desc.
        for(int i = 0; i < num_pizzas; i++){
            description += getPizzas()[i].getDescription() + "\n";
        }
        return description;
    }
}

