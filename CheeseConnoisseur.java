/**
 *
 */
public class  CheeseConnoisseur {
    private String nameCo;
    private Cheese cheeseObj;
    private double cash;
    public CheeseConnoisseur(String nameCo, double cash, Cheese cheeseObj) {
        this.nameCo = nameCo;
        this.cash = cash;
        this.cheeseObj = cheeseObj;
    }
    public CheeseConnoisseur(String nameCo, double cash) {
        this(nameCo, cash, null);
    }
    public CheeseConnoisseur(String nameCo) {
        this(nameCo,0);
    }
    public CheeseConnoisseur() {
        this("Louis Pasteur", 20.00);
    }
    public void makeTrade(Cheese cheeseObj) {
        cheeseObj.cheeseTraded();
        //this.cheeseObj = cheeseObj;
        //cheeseObj.setTotalTraded(cheeseObj.getTotalTraded()+ 1);
        //cheeseObj.setTotalTraded(cheeseObj.getTotalTraded() + 1);
        System.out.println(cheeseObj.toString());
        //if (count > 2 + cheeseObj.getTotalTraded()) {
            //cheeseObj.setSentient(true);
            //System.out.println("The cheese is sentient, and has been traded 3 times since instantiation");
        //}
    }
    public void makeTrade(CheeseConnoisseur cCon) {
        //int count = cheeseObj.getTotalTraded();
        if (cCon.cheeseObj == null || this.cheeseObj == null) {
            System.out.println("The trade will not happen: no cheese");
            return;
        }
        if (cCon.cheeseObj.equals(this.cheeseObj)) {
            System.out.println("the trade will not  happen: same cheese");
            return;
        }
        double conDiff = Math.abs(this.cheeseObj.getPrice() - cCon.cheeseObj.getPrice());
        if(cCon.cash < conDiff) {
            System.out.println(this.nameCo+" does not have enough money! Trade is over");
            System.out.println("Price difference:$ "+conDiff);
            System.out.println("New cheese price: $"+this.cheeseObj.getPrice());
            return;
        } else if(cCon.cash < conDiff) {
            System.out.println(cCon.nameCo+" does not have enough money! Trade is over. "+"Money left: $"+cCon.cash);
            System.out.println("Price difference: $"+conDiff);
            System.out.println("New cheee price: $"+cCon.cheeseObj.getPrice());
            return;
        }
             if (cCon.cheeseObj.getPrice() >= this.cheeseObj.getPrice()) { //conn giving away less expensive cheese pays difference  (price differece)
                 System.out.println("Leonce cash before:"+cCon.getCash());
                 cCon.setCash(cCon.getCash() + conDiff);
                 this.setCash(this.getCash() - conDiff);
                 System.out.println(cCon.nameCo+" Has the more expensive cheese,"+cCon.cheeseObj.getType()+", " +
                         "compared to "+this.nameCo+"'s "+this.cheeseObj.getType()+". The price difference being paid to "+cCon.nameCo+" is $"
                         +(cCon.cheeseObj.getPrice() - this.cheeseObj.getPrice())+". Current money for Jared: $" +this.getCash());
                // this.cheeseObj.setCount(cheeseObj.getCount() +1);
                 cCon.cheeseObj.setCount(cCon.cheeseObj.getCount() +1);
                 this.cheeseObj.cheeseTraded();
                 //
                 //this.cheeseObj.setTotalTraded(cheeseObj.getTotalTraded() +1);
                 //cCon.cheeseObj.setTotalTraded(cCon.cheeseObj.getTotalTraded() +1);
                 //
                 //cCon.setCash(cCon.getCash() + conDiff);
                 //this.setCash(this.getCash() - conDiff);

                 //if (cCon.cheeseObj.getCount() == 3) {
                     //cCon.cheeseObj.setSentient(true);
                     //cCon.cheeseObj.get
                    // cCon.cheeseObj.setPrice(cCon.cheeseObj.getPrice() *2);
                     //System.out.println("this cheese is sentient");
                // }
                 cCon.cheeseObj.cheeseTraded();

                 Cheese tempObject;
                 tempObject = this.cheeseObj;
                 this.cheeseObj = cCon.cheeseObj;
                 cCon.cheeseObj = tempObject;


             } else {
                 this.setCash(this.getCash() + conDiff);
                 cCon.setCash(cCon.getCash() - conDiff);
                 System.out.println(cCon.nameCo+" Has the cheaper cheese,"+cCon.cheeseObj.getType()+", " +
                         "compared to "+this.nameCo+"'s "+this.cheeseObj.getType()+". The price difference being paid to "+cCon.nameCo+" is $"
                         +(this.cheeseObj.getPrice() - cCon.cheeseObj.getPrice())+". Current money for leonce: $"+cCon.getCash());
                 //
                 //this.cheeseObj.setCount(cheeseObj.getCount() +1);
                 this.cheeseObj.cheeseTraded();
                 //cCon.cheeseObj.setCount(cCon.cheeseObj.getCount() +1);
                 //
                 //this.cheeseObj.setTotalTraded(cheeseObj.getTotalTraded() +1);
                // cCon.cheeseObj.setTotalTraded(cCon.cheeseObj.getTotalTraded() +1);
                 //
                 //cCon.setCash(cCon.getCash() - conDiff);
                 //this.setCash(this.getCash() + conDiff);
                 //if (this.cheeseObj.getCount() == 3) {
                     //this.cheeseObj.setSentient(true);
                     //this.cheeseObj.setPrice(cheeseObj.getPrice() *2);
                     //System.out.println("this cheese is sentient");
                    // this.cheeseObj.cheeseTraded();
                 //}
                 cCon.cheeseObj.cheeseTraded();
                 Cheese tempObject;
                 tempObject = this.cheeseObj;
                 this.cheeseObj = cCon.cheeseObj;
                 cCon.cheeseObj = tempObject;
                 //cCon.cheeseObj.setTotalTraded(cCon.cheeseObj.getTotalTraded() + 1);
                 //this.cheeseObj.setTotalTraded(cheeseObj.getTotalTraded() +1);


             }
       // cCon.cheeseObj.setTotalTraded(cCon.cheeseObj.getTotalTraded() + 1);
        //this.cheeseObj.setTotalTraded(cheeseObj.getTotalTraded() +1);
       // if (this.cheeseObj.getTotalTraded() == 3) {
           // cheeseObj.setSentient(true);
           // System.out.println("this cheese is sentient");
           // this.cheeseObj.cheeseTraded();
        //}

    }

    public String getName() {
        return this.nameCo;
    }
    public void setName(String nameCo) {
        this.nameCo = nameCo;
    }
    public Cheese getCheese() {
        return this.cheeseObj;
    }
    public void setCheese( Cheese cheeseObj) {
        this.cheeseObj = cheeseObj;
    }
    public double getCash() {
        return this.cash = cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }

    public static void main(String[]args) {

    }
}