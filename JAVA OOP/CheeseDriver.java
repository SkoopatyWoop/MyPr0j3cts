/**
 * In order to help learn course concepts, I worked on the homework with [Wesley D and Hassan N].
 * The CheeseDriver class takes in many methods from the Cheese and CheeseConnoisseur class, making them come to life.
 * It makes the operations, and basically the functions, much easier to read.
 * @author Leulw
 * @version 1.0
 */
public class CheeseDriver {
    /**
     * Main method: does the driver functions.
     * @param args String array represented arguments passed in by the command line.
     */
    public static void main(String[]args) {
        Cheese cheese1 = new Cheese(5.00, "Cheddar");
        Cheese cheese2 = new Cheese(10.00, "Shredded");
        Cheese cheese3 = new Cheese(10.00, "Vintage", 4);
        Cheese cheese4 = new Cheese(30.00, "One of a kind", 0);
        Cheese cheese5 = new Cheese(3.00, "white");
        CheeseConnoisseur con0 = new CheeseConnoisseur("Leonce", 20.00, cheese3);
        CheeseConnoisseur conpost0 = new CheeseConnoisseur("Jared", 15.00, cheese1);
        CheeseConnoisseur con1 = new CheeseConnoisseur();
        CheeseConnoisseur con2 = new CheeseConnoisseur("Leonce", 20.00, cheese5);
        CheeseConnoisseur con3 = new CheeseConnoisseur("Trevor", 20.00, cheese5);

    //while (!(cheese1.getSentient())  && !(cheese1.getSentient())
        // && !(cheese1.getSentient()) || !(cheese4.getSentient())))) {
//inc
        con1.makeTrade(cheese1);
        con1.makeTrade(cheese1);
        con1.makeTrade(cheese1);
        con0.makeTrade(con2);
        con0.makeTrade(con1);
        con0.makeTrade(cheese3);
        con2.makeTrade(con0);
        con0.makeTrade(cheese3);
        con0.makeTrade(cheese1);
        conpost0.makeTrade(cheese1);
       // conpost0.makeTrade(cheese5);
        conpost0.makeTrade(con0);
        conpost0.makeTrade(con0);
        conpost0.makeTrade(con0);
        conpost0.makeTrade(con3);
        con0.makeTrade(cheese1);
        con0.makeTrade(cheese5);









        // }

    }
}