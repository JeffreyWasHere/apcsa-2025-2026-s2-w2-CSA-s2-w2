public class Gate9_ShiftLeft {

    /*
     * Gate 9: Shift Left
     *
     * Shift elements left by one.
     * First element moves to the end.
     *
     * No hint.
     * You already did this in an earlier assignment! 
     * Do it again here:
     */

    public static void shiftLeft(int[] a) {
        int first = a[0];

        for (int i = 0; i < a.length -1; i++){
            a[i] = a[i+1];
        }
        a[a.length -1] = first;
    }
}
