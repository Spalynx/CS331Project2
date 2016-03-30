
/** This class emulates a simple pizza, that allows the user
 *  to input the amount of toppings, and the size of the pizza.
 *  @author Mark Eikel
 */
class Pizza{
    private int size, numch, numpep, numham;

    //Constructor to begin pizza emulation.
    Pizza(){
        size	= 0;
        numch	= 0;
        numpep	= 0;
        numham	= 0;
    } //Allows the user to save a lot of time.
    Pizza(int s, int ch, int pep,int ham){
        size	= s;
        numch	= ch;
        numpep	= pep;
        numham	= ham;
    }


    //Mutators for each value of the pizza.
    //-------------------------------------
    void setSize(int s){
        if (s >= 1 && s <= 3)
        {	size = s;	}
        else{
            System.out.println
                    ("You entered an invalid pizza size!");	}
    }
    void setCheese(int ch){		numch = ch;	}
    void setPepperoni(int pep){	numpep = pep;	}
    void setHam(int ham){		numham = ham;	}
    //-----------------------------------------------

    //Accessors for each value of the pizza.
    //--------------------------------------------------------
    int getSize(){		return size;	}
    int getCheese(){	return numch;	}
    int getPepperoni(){	return numpep;	}
    int getHam(){		return numham;	}

    //Gets the number of all toppings added together.
    int getToppings(){	return numch + numpep + numham;	}
    //-------------------------------------------------------


    //Calculates the cost of the pizza, by checking the values.
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

    //Returns a string that outputs all the contents of the pizza.
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
