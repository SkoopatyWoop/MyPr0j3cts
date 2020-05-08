

public class ArListSort {


    public static void main(String[] args) {
        ArrayList<Object> testArr= new ArrayList<>();
        testArr.addAtIndex(0, "hi");
        testArr.addToBack(45);

        for(int j = 0; j < testArr.size(); j++) {
            System.out.print(testArr.get(j)+", ");
        }
    }

}
