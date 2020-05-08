public class doubleD {
    public static void main(String[] args) {
        DoubleHw<Object> list = new DoubleHw<>(6);
        list.addAtIndex(1, "tada");
        list.addToBack("cccccc45");
        list.addAtIndex(1, 4.5);
        list.addAtIndex(1, "here boyyy!");
        list.addAtIndex(3, "loco");
        Object[] printme = list.toArray();
        for( int i = 0; i < printme.length; i++) {
            System.out.print(printme[i]+", ");
        }
    }
}
