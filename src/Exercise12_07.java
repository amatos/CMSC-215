import java.util.Scanner;
public class Exercise12_07 {
    public static void main(String[] args) {
        // Initialize scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();
        try {
            System.out.println(new Exercise12_07().bin2Dec(binaryString));
        } catch (NumberFormatException e) {
            System.out.println("Not a binary number: " + binaryString);
        }
    }

    public int bin2Dec(String binary) {
        // Convert the string to an array of characters.  This will make it easier to determine if the string is
        // a binary digit, as well as make it easier to convert the binary number to a decimal number, via the
        // formula: (2^0 * digit[0]) + (2^1 * digit[1]) + (2^2 * digit[3]) + ... + (2^(n-1) * digit[n])
        char[] numbers = binary.toCharArray();
        int result = 0;
        for(int i=numbers.length - 1; i>=0; i--) {
            // For a 2 digit number, the length of the array is "2" elements, but consists of elements at index 0 and 1,
            // so, we set the iterator (i) to the length of the array - 1, and then decrement it while it's
            // greater than or equal to 0.
            if(numbers[i] == '1') {
                // If the digit in the index location is a 1, then we add 2^(iterator - 1) to the result.
                result += Math.pow(2, numbers.length - 1 - i);
            } else if(numbers[i] != '0') {
                // Otherwise, if the result is _ANYTHING_ other than 0, we don't have a binary digit, and so we throw
                // an exception.
                throw new NumberFormatException();
            }
        }
        // If we've successfully exited the for loop, then we should have a decimal representation of the binary
        // number stored in result.  We return the value.
        return result;
    }
}
