// Gate5_AllProperty.java
public class Gate5_AllProperty {

    // TODO: return true if all elements are positive (> 0)
    public static boolean allPositive(int[] a) {
        for (int num : a) {
            if (num <= 0) {
                return false;
            }
        }
        return true;
    }
}
