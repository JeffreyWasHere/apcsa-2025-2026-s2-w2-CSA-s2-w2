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
        for (int i = 0; i < a.length; i++) {
        
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
