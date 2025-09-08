package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int firstMultiple, secondMultiple;
        firstMultiple = secondMultiple = 1;
        int firstCount , secondCount ;
        firstCount = secondCount = 0;
        final int MAX = n;
        while (a * firstMultiple < MAX && b * secondMultiple < MAX) {
            firstCount += a * firstMultiple < MAX ? 1 : 0;
            firstMultiple ++;
            secondCount += b * secondMultiple < MAX ? 1 : 0;
            secondMultiple++;
        }
        return firstCount + secondCount;
    }
}
