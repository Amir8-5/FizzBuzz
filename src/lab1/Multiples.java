package lab1;

import java.util.HashSet;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(16, 3, 5));
    }

    public static int multiples(int n, int a, int b) {

        int firstMultiple, secondMultiple;
        firstMultiple = secondMultiple = 1;
        int firstCount , secondCount ;
        firstCount = secondCount = 0;
        final int MAX = n;
        HashSet<Integer> set = new HashSet<>();
        while (a * firstMultiple < MAX || b * secondMultiple < MAX) {
            if (a * firstMultiple < MAX && !set.contains(a * firstMultiple)){
                firstCount++;
                set.add(a * firstMultiple);
            }

            if (b * secondMultiple < MAX && !set.contains(b * secondMultiple)){
                secondCount++;
                set.add(b * secondMultiple);
            }
            firstMultiple++;
            secondMultiple++;

        }
        return firstCount + secondCount;
    }
}
