public class Cheese {
    private String type_Cheese;
    private double price_Cheese;
    private boolean sentient_Cheese;
    private int count_Cheese;
    private static int totalTraded_Cheese;

    public Cheese(double price_Cheese, String type_Cheese, int totalTraded_Cheese) {
        this.price_Cheese = price_Cheese;
        this.type_Cheese = type_Cheese;
        this.totalTraded_Cheese = 0;
        if (totalTraded_Cheese > 2) {
            this.sentient_Cheese = true;
        }
    }
    public Cheese(double price_Cheese, String type_Cheese) {
        this(price_Cheese, type_Cheese, 0);
    }
    public String toString() {
        if (this.count_Cheese < 3) {
            return "this is a type of " + type_Cheese + " cheese that has been traded " + this.count_Cheese + " times.";
        } else {
            return "I am a slice of sentient " + type_Cheese + " cheese that has been traded " + (this.count_Cheese) + " times.";

        }
    }
    public boolean equals(Cheese cheeseObj) {
        if ((cheeseObj != null) && (this.type_Cheese != null)
                && (this.type_Cheese.equals(cheeseObj.type_Cheese))
                && (this.price_Cheese == cheeseObj.price_Cheese)
                && (this.sentient_Cheese == cheeseObj.sentient_Cheese)) {
            return true;
        }
        return false;
    }
    public void cheeseTraded () {
        this.totalTraded_Cheese +=1;
        this.count_Cheese +=1;
        if (this.count_Cheese == 3) {
            this.price_Cheese = price_Cheese * 2;
            System.out.println("I'M ALIIIIIVE!");
        }
    }

    public String getType() {
        return this.type_Cheese;
    }
    public void setType(String type_Cheese) {
        this.type_Cheese = type_Cheese;
    }
    public int getTotalTraded() {
        return this.totalTraded_Cheese;
    }
    public void setTotalTraded(int totalTraded_Cheese) {
        this.totalTraded_Cheese = totalTraded_Cheese;
        if(totalTraded_Cheese > 2) {
            this.sentient_Cheese = true;
        }
    }

    public double getPrice() {
        return this.price_Cheese;
    }
    public void setPrice(double price_Cheese) {
        this.price_Cheese = price_Cheese;
    }
    public int getCount() {
        return this.count_Cheese;
    }
    public void setCount(int count_Cheese) {
        this.count_Cheese = count_Cheese;

    }
    public boolean getSentient() {
        return this.sentient_Cheese;
    }
    public void setSentient(boolean sentient_Cheese) {
        this.sentient_Cheese = sentient_Cheese;
    }
    public static void main(String[] args) {
    }
}
