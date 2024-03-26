import java.util.Scanner;

public class Exercise11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();

        System.out.print("The smallest number n for m x n to be a perfect square is ");
        System.out.println(smallestNumber(m));
        System.out.println("m x n is " + m * smallestNumber(m));
    }

    public static long smallestNumber(long m) {
        long n = 1;
        while (true) {
            if (isPerfectSquare(m * n)) {
                return n;
            }
            n++;
        }
    }

    public static boolean isPerfectSquare(long num) {
        long sqrt = (long) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
