package JavaBasicCodes;

public class FrohlichNummer {
    public static void main(String[] args) {
        FrohlichNummer fn = new FrohlichNummer();
        int example1 = 48;
        int example2 = 49;
        int example3 = 42;

        System.out.println(fn.happyNummer(example1));
        System.out.println(fn.happyNummer(example2));
        System.out.println(fn.happyNummer(example3));
    }

    public boolean happyNummer(int n) {
        FrohlichNummer fn = new FrohlichNummer();
        while (n != 1 && n != 4) {
            n = fn.squaredNummerSum(n);
        }
        return n == 1;
    }

    public int squaredNummerSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

}
