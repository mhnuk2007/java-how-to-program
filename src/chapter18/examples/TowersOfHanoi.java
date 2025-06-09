package chapter18.examples;
// Fig. 18.11: TowersOfHanoi.java
// Towers of Hanoi solution with a recursive method.

public class TowersOfHanoi {
    public static void solveTowers(int disks, int sourcePeg,
                                   int destinationPeg, int tempPeg) {
        // base case -- only one disk to move
        if (disks == 1) {
            System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
            return;
        }

        // recursion step -- move (disk - 1) disks from sourcePeg
        // to tempPeg using destinationPeg
        solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);

        // move last disk from sourcePeg to destinationPeg
        System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);

        // move (disk - 1) disks from tempPeg to destinationPeg
        solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
    } // end method solveTowers

    public static void main(String[] args) {
        int startPeg = 1; // value 1 used to indicate startPeg in output
        int endPeg = 3; // value 3 used to indicate endPeg in output
        int tempPeg = 2; // value 2 used to indicate tempPeg in output
        int totalDisks = 3; // number of disks

        // initial nonrecursive call: move all disks.
        solveTowers(totalDisks, startPeg, endPeg, tempPeg);
    } // end method main
} // end of class TowersOfHanoi
