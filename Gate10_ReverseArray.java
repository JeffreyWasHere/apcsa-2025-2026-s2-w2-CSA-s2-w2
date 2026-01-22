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

    public static int[] reverse(int[] a) {
        int f = 0;
        for (int c = 0; c < a.length / 2; c++) {
            f = a[c];
            a[c] = a[a.length - 1 - c];
            a[a.length - 1 - c] = f;
        }
        return a;
    }
}

