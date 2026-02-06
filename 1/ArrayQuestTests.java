public class ArrayQuestTests {

    private static void check(String name, boolean ok) {
        if (!ok) throw new AssertionError("FAILED: " + name);
        System.out.println("PASSED: " + name);
    }

    private static boolean eqDouble(double x, double y) {
        return Math.abs(x - y) < 1e-9;
    }

    // ---------------- Gate 1: Sum/Average ----------------
    public static void testGate1_Aggregates() {
        System.out.println("\n=== Gate 1: Aggregates ===");
        check("G1 sum basic", Gate1_Aggregates.sum(new int[]{1, 2, 3}) == 6);
        check("G1 sum with negatives", Gate1_Aggregates.sum(new int[]{5, -2, -3}) == 0);

        check("G1 average 1.5", eqDouble(Gate1_Aggregates.average(new int[]{1, 2}), 1.5));
        check("G1 average exact", eqDouble(Gate1_Aggregates.average(new int[]{2, 4, 6}), 4.0));
    }

    // ---------------- Gate 2: Search ----------------
    public static void testGate2_Search() {
        System.out.println("\n=== Gate 2: Search ===");
        int[] s = {9, 4, 4, 7};
        check("G2 found at 0", Gate2_Search.indexOf(new int[]{5, 1, 2}, 5) == 0);
        check("G2 found first occurrence", Gate2_Search.indexOf(s, 4) == 1);
        check("G2 not found", Gate2_Search.indexOf(s, 10) == -1);
    }

    // ---------------- Gate 3: Min/Max ----------------
    public static void testGate3_MinMax() {
        System.out.println("\n=== Gate 3: Min/Max ===");
        check("G3 min basic", Gate3_MinMax.min(new int[]{3, 1, 7, 2}) == 1);
        check("G3 max basic", Gate3_MinMax.max(new int[]{3, 1, 7, 2}) == 7);
        check("G3 min negative-only", Gate3_MinMax.min(new int[]{-5, -2, -9}) == -9);
        check("G3 max length1", Gate3_MinMax.max(new int[]{42}) == 42);
    }

    // ---------------- Gate 4: Any property ----------------
    public static void testGate4_AnyProperty() {
        System.out.println("\n=== Gate 4: Any Property ===");
        check("G4 hasEven true", Gate4_AnyProperty.hasEven(new int[]{1, 3, 8}) == true);
        check("G4 hasEven false", Gate4_AnyProperty.hasEven(new int[]{1, 3, 5}) == false);
    }

    // ---------------- Gate 5: All property ----------------
    public static void testGate5_AllProperty() {
        System.out.println("\n=== Gate 5: All Property ===");
        check("G5 allPositive true", Gate5_AllProperty.allPositive(new int[]{1, 2, 3}) == true);
        check("G5 allPositive false zero", Gate5_AllProperty.allPositive(new int[]{1, 0, 3}) == false);
    }

    // Optional: still keep a runAll if you want
    public static void runAll() {
        testGate1_Aggregates();
        testGate2_Search();
        testGate3_MinMax();
        testGate4_AnyProperty();
        testGate5_AllProperty();
        System.out.println("\nGATES 1–5 CLEARED ✅");
    }
}
