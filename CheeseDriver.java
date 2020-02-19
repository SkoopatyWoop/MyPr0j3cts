public class CheeseDriver {
    public static void main(String[]args) {
    Cheese cheese1 = new Cheese(5.00, "Cheddar");
    Cheese cheese2 = new Cheese(10.00, "Shredded");
    Cheese cheese3 = new Cheese(20.00, "Vintage", 4);
    Cheese cheese4 = new Cheese(30.00, "One of a kind", 0);
    Cheese cheese5 = new Cheese(3.00, "white");
        CheeseConnoisseur con0 = new CheeseConnoisseur("Leonce", 20.00, cheese3);
        CheeseConnoisseur conpost0 = new CheeseConnoisseur("Jared", 15.00, cheese1);
    CheeseConnoisseur con1 = new CheeseConnoisseur();
    CheeseConnoisseur con2 = new CheeseConnoisseur("Leonce", 20.00, cheese2);
        CheeseConnoisseur con3 = new CheeseConnoisseur("Trevor", 20.00, cheese5);

    //while (!(cheese1.getSentient())  && !(cheese1.getSentient()) && !(cheese1.getSentient()) || !(cheese4.getSentient())))) {
//inc
        //con0.makeTrade(cheese1);
       // con0.makeTrade(cheese1);
       // conpost0.makeTrade(cheese1);
       // conpost0.makeTrade(cheese5);
        conpost0.makeTrade(con2);
        conpost0.makeTrade(con2);
        conpost0.makeTrade(con2);
        conpost0.makeTrade(con3);








        // }

    }
}