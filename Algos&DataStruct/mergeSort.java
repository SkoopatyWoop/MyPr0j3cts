

public class mergeSort {
    public static void main(String[] args) {

        int[] sortme = {29, 28, 27, 25, 24, 16, 12, 10, 8, 5, 3, 1, 0, -4, -8, -10, 20};

        mergeSort(sortme, sortme.length);
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(int i : sortme)
            sb.append(i + ",");
        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");
        System.out.println(sb);
    }

    /**
     * Method available for brwaking down a large array to smaller, individual, arrays
     * @param sortme array taken in to be broken down to left,right array.
     * @param n length of sortme
     */
    public static void mergeSort(int[] sortme, int n) {
            if(n < 2) {
                return;
            }

            // Find the middle point and separate two arrays
            int mid = n / 2;
            int l[] = new int[mid];
            int r[] = new int[n - mid];

            // fill in left array
            for(int i =0; i < mid; i++) {
                l[i] = sortme[i];
            }
            //fill in right array
            for(int i =mid; i < n ; i++) {
                r[i - mid] = sortme[i];
            }


            //break left and right array to necessary parts
            mergeSort(l, mid);
            mergeSort(r, n - mid);

            //merge the two individual arrays
            merge(sortme, l, r, mid, n - mid);



    }

    /**
     * merge that will sort and merge two arrays back
     * @param sortme original array
     * @param l left array
     * @param r right array
     * @param left array length
     * @param right array length
     */
    public static void merge(int[] sortme, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        /*while both left and right array counters are less than each left and right array,
            sortme will be sorted in order of left and right array element comparisons.
            Index to index.
         */

        while(i < left && j < right) {
            if(l[i] <= r[j]) {
                sortme[k++] = l[i++];
            } else {
                sortme[k++] = r[j++];
            }

        }
        /*
            if we run out of elements in the right index, put the rest of the sorted left index
            on the remaining array indexes at the end of sortme.
         */
        while(i < left) {
            sortme[k++] = l[i++];
        }
        /*
            If we run out of welements in the left index, put the rest of the elements of the right index
            on the remaining array indexes at the end of sortme.
         */
        while(j < right) {
            sortme[k++] = r[j++];
        }
    }

}