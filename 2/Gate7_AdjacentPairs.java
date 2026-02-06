public class Gate7_AdjacentPairs {

    /*
     * Gate 7: Adjacent Pairs
     *
     * Count how many times two consecutive elements are equal.
     *
     * Hint:
     * - Compare a[i] with a[i + 1]
     * - Where should the loop stop if you are using i +1 as an index?
     */

    // TODO
    public static int countAdjacentDuplicates(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length -1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            }

        }
        return count;
    }
}


