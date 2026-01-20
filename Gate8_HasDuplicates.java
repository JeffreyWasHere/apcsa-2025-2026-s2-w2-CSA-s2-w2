public class Gate8_HasDuplicates {

    /*
     * Gate 8: Detect Duplicates
     *
     * Return true if any value appears more than once.
     *
     * Hint:
     * - Use nested loops
     * - Compare each element with elements AFTER it
     */

    public static boolean hasDuplicates(int[] a) {
        int count = 0;
        int f = a[0];
        for  (int p = f; p < a.length; f++){
            for (int i = f + 1; i < a.length; i++) {
                if (f == i) {
                    count++;
                }
            }
            return true;
        }
        return false;
    }
}
