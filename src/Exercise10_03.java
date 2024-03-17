import java.util.Scanner;

public class Exercise10_03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    MyInteger n1 = new MyInteger(input.nextInt());
    System.out.println("n1 is even? " + n1.isEven());
    System.out.println("n1 is prime? " + n1.isPrime());
    System.out.println("15 is prime? " + MyInteger.isPrime(15));

    char[] chars = {'3', '5', '3', '9'};
    System.out.println(MyInteger.parseInt(chars));

    System.out.print("Enter a string: ");
    String s = input.next();
    System.out.println("You entered " + MyInteger.parseInt(s));

    System.out.print("Enter an integer: ");
    MyInteger n2 = new MyInteger(input.nextInt());
    System.out.println("n2 is odd? " + n2.isOdd());
    System.out.println("45 is odd? " + MyInteger.isOdd(45));
    System.out.println("n1 is equal to n2? " + n1.equals(n2));
    System.out.println("n1 is equal to 5? " + n1.equals(5));
  }
}

class MyInteger {
  private int value;

  public MyInteger(int value) {
    this.value = value;
  }


  public boolean isEven() {
    return value % 2 == 0;
  }

  public boolean isOdd() {
    return value % 2 != 0;
  }

  public boolean isPrime() {
    return isPrime(value);
  }


  public static boolean isEven(int value) {
        return value % 2 == 0;
    }
  public static boolean isOdd(int value) {
    return value % 2 != 0;
  }

  public static boolean isPrime(int value) {
    if (value == 0 || value == 1) return false;
    for (int i = 2; i <= value / 2; i++) {
      if (value % i == 0) return false;
    }
    return true;
  }



  public boolean equals(int value) {
    return this.value == value;
  }

  public boolean equals(MyInteger myInteger) {
    return myInteger.value == this.value;
  }

  public static int parseInt(char[] chars) {
    int value = 0;
    for (char c : chars) {
      value = value * 10 + (c - '0');
    }
    return value;
  }

  public static int parseInt(String s) {
    return Integer.parseInt(s);
  }
}
