/** This class emulates a simple pizza, that allows the user
 *  to input the amount of toppings, and the size of the pizza.
 *
 *  @author Mark Eikel
 *  @since 22 March 2016
 */
class Pizza{
    private int size, numch, numpep, numham;

    /** Initializes all of the private fields to
     *  zero, effectively setting the cost to 0.
     */
    Pizza(){
        size	= 0;
        numch	= 0;
        numpep	= 0;
        numham	= 0;
    }

    /** Saves a lot of time. Allows the user to
     *  input all of the values of the pizza on creation.
     *
     * @param s     Int size of the pizza can't be bigger than 3.
     * @param ch    Number of cheeses to add to pizza. 2$ a piece.
     * @param pep   Number of pepperoni to add to pizza. 2$
     * @param ham   Number of ham toppings to add to pizza. 2$
     */
    Pizza(int s, int ch, int pep,int ham){
        size	= s;
        numch	= ch;
        numpep	= pep;
        numham	= ham;
    }


    /** Sets the size of the pizza, 1-3 set it to
     *  small,medium,large in order. Anything over
     *  does not modify the size.
     * @param s Size of the pizza (int)1-3.
     */
    void setSize(int s){
        if (s >= 1 && s <= 3)
        {	size = s;	}
        else{
            System.out.println
                    ("You entered an invalid pizza size!");	}
    }
    /** Sets the number of cheeses, any integer allowed.
     * @param ch number of cheeses to add.
     */
    void setCheese(int ch){		numch = ch;	}
    /** Sets the number of pepperoni.
     * @param pep number of pepperonis on the pizza. Any int allowed.
     */
    void setPepperoni(int pep){	numpep = pep;	}
    /** Sets the number of ham toppings on the pizza.
     * @param ham number of ham toppings on the pizza. Any int.
     */
    void setHam(int ham){		numham = ham;	}


    /** Returns the size of the pizza 1-3.
      * @return Size of the pizza 1 < size < 3.
     */
    int getSize(){		return size;	}
    /** Returns the amount of cheeses on the pizza.
     * @return number of cheeses on pizza.
     */
    int getCheese(){	return numch;	}
    /** Returns the number of pepperoni toppings on pizza.
     * @return number of pepperoni toppings on pizza.
     */
    int getPepperoni(){	return numpep;	}
    /** Returns the number of ham toppings on the pizza.
     * @return number of ham toppings on the pizza.
     */
    int getHam(){		return numham;	}
    /** Returns the total number of toppings on the pizza.
     * @return total toppings (ch + pep + ham).
     */
    int getToppings(){	return numch + numpep + numham;	}


    /** Calculates the total cost of the pizza. Gathers the
     *  total toppings, multiplies by 2x and adds the flat fee.
     * @return total cost of the pizza.
     */
    double calcCost(){
        double cost = 0;
        switch(getSize()){
            case 1: //Small is $10 + $2 per topping
                cost += 10;
                break;
            case 2: //Med is $12 + $2 per topping
                cost += 12;
                break;
            case 3: //Large is $14 + $2 per topping
                cost += 14;
                break;
        }

        //Returns the size + toppings * 2.
        cost += (getToppings() * 2);
        return cost;
    }

    /** Returns a string that outputs all the contents of the pizza.
     * @todo add a -v parameter, because this is just crazy.
     * @return The total, verbose list of what makes up this pizz.
     */
    String getDescription(){
        String desc = "You ordered a ";
        //Finding size of pizza.
        switch(getSize()){
            case 1:
                desc += "small ";
                break;
            case 2:
                desc += "medium ";
                break;
            case 3:
                desc += "large ";
                break;
        }
        //Adding amount of each topping.
        desc += "pizza with:\n\t"
                + getCheese() 		+ " cheese toppings,\n\t"
                + getPepperoni()	+ " pepperoni toppings,\n\t"
                + getHam() 		+ " ham toppings.\n";

        //Finding total value of the pizza.
        desc += "The total cost is: $" + calcCost() + ".\n";

        return desc;
    }

} //Class Pizza
