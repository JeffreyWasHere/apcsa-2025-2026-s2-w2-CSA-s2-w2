public class Gate3_MinMax {

    public static int min(int[] a) {
        int currentMin = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] < currentMin) {
                currentMin = a[i];
            }
        }
        return currentMin;
    }

    public static int max(int[] a) {
        int currentMax = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] > currentMax) {
                currentMax = a[i];
            }
        }
        return currentMax;
    }
}