public class Gate6_CountAboveAverage {

    /*
     * Gate 6: Count Above Average
     *
     * Return how many elements are greater than the average.
     *
     * Hint:
     * - First compute the average
     * - Then count values greater than it
     * - Two loops expected
     */

    public static int countAboveAverage(int[] a) {
        double i = 0.0;
        double average = 0;
        for (int num : a) {
            average += num;
            i = average / a.length;
        }

        int p = 0;
        for (int num : a) {
            if (num > i) {
                p++;

            }
        }
        return p;
    }
}




