/** The PizzaOrder class is a wrapper for 1 <= x <= 3 pizzas
 * allowing a person to emulate an order of pizza.
 *
 * @author Mark Eikel
 * @since 22 March 2016
 */
public class PizzaOrder {
    //The pizzas and number of pizzas.
    private Pizza[] pizzas = new Pizza[3];
    protected int num_pizzas;



    /** Empty constructor, sets num of pizzas automatically
     *  to 3, the max amt.
     */
    public PizzaOrder() {
        setNumPizzas(3);
        num_pizzas = 3;
    }
    /** Allows the user to initialize with a certain
     *  number of pizzas to be placed within.
     * @param nP number of pizzas to set the number as.
     */
    public PizzaOrder(int nP){
        setNumPizzas(nP);
    }



    /** Accessor for the array of pizzas. By default
     *  has a length of 3, use int num_pizzas for size.
     * @return The internal array of pizzas.
     */
    public Pizza[] getPizzas(){
        return pizzas;          }
    /** Calculates the total cost of the pizzas inside
     *  the pizzas array.
     *  @return The total cost of pizzas
     */
    public double getTotal(){
        return pizzas[0].calcCost()
                + pizzas[1].calcCost()
                + pizzas[2].calcCost();
    }



    /**Outputs the descriptions of each pizza.
     * @return The description of the pizzas.
     */
    public String toString(){
        String description = "";
        for(Pizza p : pizzas){
            description += p.getDescription();
        }
        return description;
    }



    /**Sets the amount of pizzas in the class by changing
     *  int num_pizzas to the desired.
     * @param numPizzas
     */
    public void setNumPizzas(int numPizzas){
        if(numPizzas > 3 || numPizzas < 1)
            System.out.println("Amt of pizzas not correct! Try again!");
        else {
            num_pizzas  = numPizzas;
        }
    }
    /** Fills the 1nd pizza in a pizza order with a given pizza.
     * @param pizza1 The pizza to be copied into the array.
     */
    public void setPizza1(Pizza pizza1){
        if (num_pizzas < 1){
            num_pizzas = 1;
        }
        pizzas[0] = pizza1;
    }
    /** Fills the 2nd pizza in a pizza order with a given pizza.
     * @param pizza2 The pizza to be copied into the array.
     */
    public void setPizza2(Pizza pizza2){
        if (num_pizzas == 1){
            num_pizzas = 2;
        }
        pizzas[1] = pizza2;

    }
    /** Fills the 3rd pizza in a pizza order with a given pizza.
     * @param pizza3 The pizza to be copied into the array.
     */
    public void setPizza3(Pizza pizza3){
        if (num_pizzas < 3) {
            num_pizzas =3;
        }
        pizzas[2] = pizza3;

    }

}