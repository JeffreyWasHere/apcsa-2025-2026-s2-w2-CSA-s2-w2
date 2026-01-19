public class ArrayGameTests {

    public static void runGate6() {
        int[] a = {2, 4, 6, 8};

        if (Gate6_CountAboveAverage.countAboveAverage(a) == 2) {
            System.out.println("Gate 6 PASSED");
        } else {
            System.out.println("Gate 6 FAILED");
        }
    }

    public static void runGate7() {
        int[] a = {1, 2, 2, 3, 3, 3};

        if (Gate7_AdjacentPairs.countAdjacentDuplicates(a) == 3) {
            System.out.println("Gate 7 PASSED");
        } else {
            System.out.println("Gate 7 FAILED");
        }
    }

    public static void runGate8() {
        int[] a = {3, 1, 4, 3};

        if (Gate8_HasDuplicates.hasDuplicates(a)) {
            System.out.println("Gate 8 PASSED");
        } else {
            System.out.println("Gate 8 FAILED");
        }
    }

    public static void runGate9() {
        int[] a = {1, 2, 3, 4};
        Gate9_ShiftLeft.shiftLeft(a);

        if (a[0] == 2 && a[3] == 1) {
            System.out.println("Gate 9 PASSED");
        } else {
            System.out.println("Gate 9 FAILED");
        }
    }

    public static void runGate10() {
        int[] a = {1, 2, 3, 4};
        Gate10_ReverseArray.reverse(a);

        if (a[0] == 4 && a[3] == 1) {
            System.out.println("Gate 10 PASSED");
        } else {
            System.out.println("Gate 10 FAILED");
        }
    }
}
