public class Gate2_Search {

    // TODO: return first index of target, or -1 if not found
    public static int indexOf(int[] a, int target) {

        for (int indexA = 0; indexA < a.length; indexA++) {
            if (a[indexA] == target) {
                return indexA;
            }
        }
        return -1;
    }
    
}