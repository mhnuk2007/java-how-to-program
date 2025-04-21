package chapter5.exercises;

/*
    5.23 (De Morgan’s Laws)
    Verifies equivalence of expressions using De Morgan's laws.
*/

public class DeMorgansLaw {
    public static void main(String[] args) {
        // a) !(x < 5) && !(y >= 7)
        int x = 6, y = 5;
        boolean result1 = !(x < 5) && !(y >= 7);
        boolean result2 = !((x < 5) || (y >= 7));
        System.out.println("a) Result 1: " + result1);
        System.out.println("   Result 2: " + result2);

        // b) !(a == b) || !(g != 5)
        int a = 3, b = 4, g = 5;
        boolean result3 = !(a == b) || !(g != 5);
        boolean result4 = !((a == b) && (g != 5));
        System.out.println("b) Result 3: " + result3);
        System.out.println("   Result 4: " + result4);

        // c) !((x <= 8) && (y > 4))
        boolean result5 = !((x <= 8) && (y > 4));
        boolean result6 = !(x <= 8) || !(y > 4);
        System.out.println("c) Result 5: " + result5);
        System.out.println("   Result 6: " + result6);

        // d) !((i > 4) || (j <= 6))
        int i = 5, j = 7;
        boolean result7 = !((i > 4) || (j <= 6));
        boolean result8 = !(i > 4) && !(j <= 6);
        System.out.println("d) Result 7: " + result7);
        System.out.println("   Result 8: " + result8);
    }
}
