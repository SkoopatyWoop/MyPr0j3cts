/**
 *  The cheese class which allows you to make object instances of cheese, anywhere from creating an instance cheese.
 *   to declaring its price and how many times it has been traded
 * @author Leulw
 * @version 1.0
 */
public class Cheese {
    private String typeCheese;
    private double priceCheese;
    private boolean sentientCheese;
    private int countCheese;
    private static int totalTrades;

    /**
     * A cheese constructor taking in name, type of cheese, and cheese trade count.
     * @param priceCheese the price of specified cheese
     * @param typeCheese the type of specified cheese
     * @param countCheese the trade count odf specified cheese
     */
    public Cheese(double priceCheese, String typeCheese, int countCheese) {
        this.priceCheese = priceCheese;
        this.typeCheese = typeCheese;
        this.countCheese = countCheese;
        if (countCheese > 2) {
            this.sentientCheese = true;
        }
    }

    /**
     * A cheese constructor taking in name, type of cheese.
     * @param priceCheese this is the cheese price we will pass in, rooted back to CheeseDriver invoking
     * @param typeCheese this is the cheese type  we will pass in, rooted back to CheeseDriver invoking
     */
    public Cheese(double priceCheese, String typeCheese) {
        this(priceCheese, typeCheese, 0);
    }

    /**
     * no arg method that will print the type of cheese, and the current count of times traded.
     * @return no arg method that will print the type of cheese, and the current count of times traded
     */
    public String toString() {
        if (this.countCheese < 3) {
            return "this is a type of " + typeCheese + " cheese that has been traded " + this.countCheese + " times.";
        } else {
            return "I am a slice of sentient " + typeCheese + " cheese that has been traded "
                    + (this.countCheese) + " times.";

        }
    }

    /**
     *An equals method that checks if a cheese is null or not, then checks all the possible properties of the cheese.
     * @param cheeseObj is a passed in cheese object the method: checks for null, price, and sentient equalities.
     * @return returns if the two cheeses are equal or not. Which will be used in Connoisseur class for evaluation.
     */
    public boolean equals(Cheese cheeseObj) {
        if ((cheeseObj != null) && (this.typeCheese != null)
                && (this.typeCheese.equals(cheeseObj.typeCheese))
                && (this.priceCheese == cheeseObj.priceCheese)
                && (this.sentientCheese == cheeseObj.sentientCheese)) {
            return true;
        }
        return false;
    }

    /**
     * a method that increment a specific cheese's trade count by one and checks for sentience.
     */
    public void cheeseTraded() {
        this.countCheese += 1;
        System.out.println("Total times all the cheese have been traded: " + this.totalTrades);
        if (this.countCheese == 3) {
            this.priceCheese = priceCheese * 2;
            System.out.println(this.typeCheese + ": I'M ALIIIIIVE!");
            System.out.println("new price for " + this.typeCheese + ": " + this.priceCheese);
        }
    }

    /**
     * method that gets the type of cheese.
     * @return this will return the type of cheese for the instance.
     */
    public String getType() {
        return this.typeCheese;
    }

    /**
     * A method that will take in a cheese value and set it for the current object instance.
     * @param type sets the type of cheese for the current instance.
     */
    public void setType(String type) {
        this.typeCheese = type;
    }

    /**
     * A method that returns how many times all cheeses have been traded.
     * @return returns the cheese traded for all cheese.
     */
    public int getTotalTraded() {
        return this.totalTrades;
    }

    /**
     * method that sets the total traded, but used very carefully.
     * @param total takes in an intiger to set the total trades when invoked by cheese connoisseur.
     */
    public void setTotalTraded(int total) {
        this.totalTrades = total;
        if (totalTrades > 2) {
            this.sentientCheese = true;
        }
    }

    /**
     * This method returns the price of the cheese.
     * @return the cheese price.
     */
    public double getPrice() {
        return this.priceCheese;
    }

    /**
     * sets the cheese price.
     * @param price takes in param to set cheese price to the passed in value.
     */
    public void setPrice(double price) {
        this.priceCheese = price;
    }

    /**
     * The method returns the current count value for the cheese instance.
     * @return the count value for current cheese object instance.
     */
    public int getCount() {
        return this.countCheese;
    }

    /**
     * A setter for the cheese count.
     * @param count takes in and sets the cheese count for the instance object.
     */
    public void setCount(int count) {
        this.countCheese = count;
    }

    /**
     * A getter that gets sentient boolean for cheese object.
     * @return return sentient boolean.
     */
    public boolean getSentient() {
        return this.sentientCheese;
    }

    /**
     * A setter for boolean sentient.
     * @param sentient takes in a boolean param and sets it to sentient for the instance object.
     */
    public void setSentient(boolean sentient) {
        this.sentientCheese = sentient;
    }

}
