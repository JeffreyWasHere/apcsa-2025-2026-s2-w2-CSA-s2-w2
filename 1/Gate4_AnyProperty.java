public class Gate4_AnyProperty {

    // TODO: return true if at least one element is even
    public static boolean hasEven(int[] a) {
        for (int num : a){
            if (num % 2 == 0){
                return true;
            }
        }
        
        return false;
    }

}