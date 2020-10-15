public class Merge {

    // stably merge a[lo .. mid] with a[mid+1 ..hi] using aux[lo .. hi]
    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for(int i = lo; i < hi + 1; i ++)
            aux[i] = a[i];

        int i = lo;
        int j = mid + 1;
        for (int m = lo; m <= hi; m ++){

            if (i == mid + 1)
                a[m] = aux[j++];
            else if (j == hi + 1)
                a[m] = aux[i ++];
            else if (less(aux[i], aux[j]))
                a[m] = aux[i++];
            else
                a[m] = aux[j++];

        }    
    }

    // // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (lo < hi){
            int mid = (lo + hi ) / 2;
            sort(a,aux,lo, mid);
            sort(a,aux,mid + 1, hi);
            merge(a, aux, lo, mid, hi);
        }
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {
        int[] aux = new int[a.length];
        sort(a,aux, 0, a.length - 1);
    }


   /***************************************************************************
    *  Helper sorting function.
    ***************************************************************************/
    
    // is v < w ?
    private static boolean less(Integer v, Integer w) {
         if (v.compareTo(w) < 0)
            return true;
        return false;
        
    }
        
   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/
    // private static boolean isSorted(int[] a) {
        
    // }

    // private static boolean isSorted(int[] a, int lo, int hi) {
    // }

    // print array to standard output
    private static void show(int[] a) {
        sort(a);
        System.out.print("Array after merge sort: ");
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i]+" " );
        }
        
    }

    /**
     * Reads in a sequence of strings from standard input; mergesorts them; 
     * and prints them to standard output in ascending order. 
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] a = {4,7,8,2,3,5};
        System.out.print("Array before merge sort: ");
    
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Merge.sort(a);
        show(a);
    }
}