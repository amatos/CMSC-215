import java.util.Scanner;
public class Exercise12_08Extra {
    public static void main(String[] args) {
        try {
            System.out.print("Enter an integer: ");
            Scanner input = new Scanner(System.in);
            int intValue = input.nextInt();
            EvenNumber evenNumber = new EvenNumber(intValue);
            System.out.println("Current number is " + evenNumber.getValue());
            System.out.println("Next even number is "
                    + evenNumber.getNext().getValue());
            System.out.println("Previous even number is "
                    + evenNumber.getPrevious().getValue());
        }
        catch (RuntimeException ex) {
            System.out.println(ex);
        }
    }
}

class EvenNumber {
    private int n;

    public EvenNumber() {
        n = 0;
    }

    public EvenNumber(int n) {
        if (n % 2 == 0) {
            this.n = n;
        } else {
            throw new RuntimeException("value not even");
        }
    }

    public int getValue() {
        return n;
    }

    public EvenNumber getNext() {
        return new EvenNumber(n + 2);
    }

    public EvenNumber getPrevious() {
        return new EvenNumber(n - 2);
    }
}
