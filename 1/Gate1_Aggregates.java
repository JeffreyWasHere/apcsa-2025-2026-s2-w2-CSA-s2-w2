public class Gate1_Aggregates{

    //TODO: return sim of all elements
    public static int sum(int[] a) {
        int total = 0;
        for (int num : a) {
            total += num;
        }

        return total;
    }

    // TODO: return average as a double (avoid interger division)
    public static double average(int[] a){
        double total = 0.0;
        for (int num : a) {
            total += num;
        }

        return total / a.length;
    }
}