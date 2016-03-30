/** Pizza order pretty much emulates buying <= 3 pizzas at once.
 * @todo debug and actually document this slop.
 *
 * @author Spalynx
 * @since 22 Mar. 2016
 */
public class PizzaOrder {
    //The pizzas and number of pizzas.
    private Pizza[] pizzas;
    protected int num_pizzas;

    //Constructors
    public PizzaOrder() {
        setNumPizzas(3);
        num_pizzas = 3;
    }
    public PizzaOrder(int nP){
        setNumPizzas(nP);
    }

    //Accessor for pizzas
    public Pizza[] getPizzas(){
        return pizzas;          }

    //Sets the amount of pizzas in the class.
    public void setNumPizzas(int numPizzas){
        if(numPizzas > 3 && numPizzas < 1){
            System.out.println("Amt of pizzas not correct! Try again!");
        }
        else {
            pizzas      = new Pizza[numPizzas];
            num_pizzas  = numPizzas;
        }
    }

    //Outputs the descriptions of each pizza.
    public String toString(){
        String description = "";
        for(Pizza p : pizzas){
            description += p.getDescription();
        }
        return description;
    }

    //Mutators for the pizzas in this class.
    public void setPizza1(Pizza pizza1){
        if (num_pizzas >= 1) {
            pizzas[0] = pizza1;
        }
        if (num_pizzas < 1){
            num_pizzas = 1;
        }
    }
    public void setPizza2(Pizza pizza2){
        if (num_pizzas >= 2) {
            pizzas[1] = pizza2;
        }
        if (num_pizzas < 2){
            num_pizzas = 2;
        }

    }
    public void setPizza3(Pizza pizza3){
        if (num_pizzas >= 3) {
            pizzas[2] = pizza3;
        }
        if (num_pizzas < 3) {
            num_pizzas =3;
        }

    }

    //Calculates the total cost of these pizzas.
    public double calcTotal(){
        return pizzas[0].calcCost()
                + pizzas[1].calcCost()
                + pizzas[2].calcCost();
    }

}
