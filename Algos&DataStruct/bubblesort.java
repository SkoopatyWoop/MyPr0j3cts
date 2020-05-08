import java.util.Random;

public class bubblesort<T> {

    public static void main(String[] args) {
        int[] unsorted = randarray(20);
        for(int element : unsorted) {
            System.out.print(element+" ");
        }
        System.out.println();
        int[] sorted =bubbleSort(unsorted);
        for(int element: sorted) {
            System.out.print(element+" ");
        }

        System.out.println();
        int[] sortSelection =selectionSort(unsorted);
        for(int element: sorted) {
            System.out.print(element+" ");
        }

    }
    public static int[] randarray(int n) {
        Random random = new Random();
        int[] rando = new int[n];
        for (int i = 0; i < n; i++) {
            rando[i] = random.nextInt(100);
        }
        return rando;
    }

    public static int[] bubbleSort(int[] sortme) {
      for (int i = 0; i < sortme.length-1; i++) {
          for (int j = 0; j < sortme.length -1 - i; j++) {
              if(sortme[j] > sortme[j+1]) {
                  int temp = sortme[j];
                  sortme[j] = sortme[j+1];
                  sortme[j+1] = temp;
              }
          }
      }
        return sortme;
    }

    public static int[] selectionSort(int[] sortme) {
       for (int i = 0; i < sortme.length - 2; i++) {
           int minIndex = 0;
           for (int j = i + 1; j < sortme.length - 1; j++) {
               if (sortme[j] > sortme[minIndex]) {
                   minIndex = j;
                   int temp = sortme[j];
                   sortme[j] = sortme[minIndex];
                   sortme[minIndex] = temp;
               }
           }
           }
       return sortme;
       }
}
