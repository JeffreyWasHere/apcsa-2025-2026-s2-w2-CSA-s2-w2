public class Gate10_ReverseArray {

    /*
    This is a more challenging problem!
     * Gate 10: Reverse Array
     *
     * Reverse the array in place.
     *
     * Hint:
     * - Use two indices
     * - Swap values
     * - Loop only halfway
     */

    public static void reverse(int[] a) {
        int first;
        int last;
        int intermediate;

        for (int i = 0; i < a.length/2; i++ ){
            // grab values
            first = a[i];
            last = a[a.length - 1 - i];
            intermediate = first;

            // swap
            a[i] = last;
            a[a.length - 1 - i] = intermediate;

        }
    }
}
