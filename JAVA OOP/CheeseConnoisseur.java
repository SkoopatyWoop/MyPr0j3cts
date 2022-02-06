/**
 * CheeseConnoisseur class is the powerhouse. It generates the trades for a single connoisseur and two connoisseurs.
 *  Constructor methods are made or different types of trades.
 *@author Leulw
 * @version 1.0
 *
 */
public class  CheeseConnoisseur {
    private String nameCo;
    private Cheese cheeseObj;
    private double cash;

    /**
     *A CheeseCon. constructor that takes in name, money, and a cheese object for an advanced trade
     * @param nameCo takes in a Connoisseur name and sets it equal to the current object instance's name
     * @param cash takes in a Connoisseur money and sets it equal to the current object instance's money
     * @param cheeseObj takes in a Connoisseur cheeseObj and sets it equal to the current object instance's cheeseObj.
     */
    public CheeseConnoisseur(String nameCo, double cash, Cheese cheeseObj) {
        this.nameCo = nameCo;
        this.cash = cash;
        this.cheeseObj = cheeseObj;
    }

    /**
     *A CheeseCon. constructor that takes in name, money. Uses constructor chaining to make code less redundant.
     * @param nameCo takes in a name for the Connoisseur
     * @param cash takes in money/cash amount of the Connoisseur
     */
    public CheeseConnoisseur(String nameCo, double cash) {
        this(nameCo, cash, null);
    }

    /**
     *A CheeseCon. constructor that takes in name. Uses constructor chaining, using constructor above it.
     * @param nameCo takes in the name of the Connoisseur
     */
    public CheeseConnoisseur(String nameCo) {
        this(nameCo, 0);
    }

    /**
     * The default, handsome, Connoisseur.
     */
    public CheeseConnoisseur() {
        this("Louis Pasteur", 20.00);
    }

    /**
     * A simple trading method that allows a connoisseur to trade cheese with no one present.
     * @param cheeseObject takes in a passed in cheese object which should have all of its values provided.
     */
    public void makeTrade(Cheese cheeseObject) {
        cheeseObject.cheeseTraded();
        this.cheeseObj = cheeseObject;
        System.out.println(this.cheeseObj.getType());
        System.out.println(cheeseObject.toString());
        cheeseObject.setTotalTraded(cheeseObject.getTotalTraded() + 1);
    }

    /**
     *A trading method that allows a connoisseur to trade cheese with another connoisseur.
     * @param cCon passed in cheese Connoisseur that will be validated and implies a trade between two Connoisseurs.
     */
    public void makeTrade(CheeseConnoisseur cCon) {
        //int count = cheeseObj.getTotalTraded();
        if (cCon.cheeseObj == null || this.cheeseObj == null) {
            System.out.println("The trade will not happen: no cheese");
            return;
        }
        if (cCon.cheeseObj.equals(this.cheeseObj)) {
            System.out.println("the trade will not happen: same cheese");
            return;
        }
        double conDiff = Math.abs(this.cheeseObj.getPrice() - cCon.cheeseObj.getPrice());
        if (cCon.cash < conDiff) {
            System.out.println(this.nameCo + " does not have enough money! Trade is over");
            System.out.println("Price difference:$ " + conDiff);
            System.out.println("New cheese price: $" + this.cheeseObj.getPrice());
            return;
        } else if (cCon.getCash() < conDiff) {
            System.out.println(cCon.nameCo + " does not have enough money! Trade is over. "
                    + "Money left: $" + cCon.cash);
            System.out.println("Price difference: $" + conDiff);
            System.out.println("New cheese price: $" + cCon.cheeseObj.getPrice());
            return;
        }
        if (cCon.cheeseObj.getPrice() >= this.cheeseObj.getPrice()) {
            //conn giving away less expensive cheese pays difference  (price differece)
            System.out.println("Leonce cash before:" + cCon.getCash());
            cCon.setCash(cCon.getCash() + conDiff);
            this.setCash(this.getCash() - conDiff);
            System.out.println(cCon.nameCo + " Has the more expensive cheese," + cCon.cheeseObj.getType() + ", "
                    + "compared to " + this.nameCo + "'s " + this.cheeseObj.getType()
                    + ". The price difference being paid to " + cCon.nameCo + " is $"
                    + (conDiff) + ". Current money for Jared: $"  + this.getCash());
            this.cheeseObj.cheeseTraded();
            cCon.cheeseObj.cheeseTraded();
            cCon.cheeseObj.setTotalTraded(cCon.cheeseObj.getTotalTraded() + 1);
            Cheese tempObject;
            tempObject = this.cheeseObj;
            this.cheeseObj = cCon.cheeseObj;
            cCon.cheeseObj = tempObject;
        } else {
            this.setCash(this.getCash() + conDiff);
            cCon.setCash(cCon.getCash() - conDiff);
            System.out.println(cCon.nameCo + " Has the cheaper cheese," + cCon.cheeseObj.getType() + ", "
                    + "compared to " + this.nameCo + "'s " + this.cheeseObj.getType()
                    + ". The price difference being paid to " + this.nameCo + " is $"
                    + (conDiff) + ". Current money for" + cCon.nameCo + ": $" + cCon.getCash());
            this.cheeseObj.cheeseTraded();
            cCon.cheeseObj.cheeseTraded();
            cCon.cheeseObj.setTotalTraded(cCon.cheeseObj.getTotalTraded() + 1);
            Cheese tempObject;
            tempObject = this.cheeseObj;
            this.cheeseObj = cCon.cheeseObj;
            cCon.cheeseObj = tempObject;
        }
    }

    /**
     *getter for connis. name.
     * @return returns the name of the current instance Connoisseur.
     */
    public String getName() {
        return this.nameCo;
    }

    /**
     * setter for conn. name.
     * @param name sets a new name of a Connoisseur.
     */
    public void setName(String name) {
        this.nameCo = name;
    }

    /**
     * getter for cheese object.
     * @return this is a getter for the cheese object currently being used.
     */
    public Cheese getCheese() {
        return this.cheeseObj;
    }

    /**
     * setter for cheese object.
     * @param cheeseobject a parameter taking in a cheese instance object and setting it to the current cheese.
     */
    public void setCheese(Cheese cheeseobject) {
        this.cheeseObj = cheeseobject;
    }

    /**
     * getter for money/cash.
     * @return returns the current money for the given Connoisseur.
     */
    public double getCash() {
        return this.cash;
    }

    /**
     * setter for money/cash.
     * @param cash takes in and assigns a given value for the Connoisseur's money.
     */
    public void setCash(double cash) {
        this.cash = cash;
    }


}