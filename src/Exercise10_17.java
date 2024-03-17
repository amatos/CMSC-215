import java.math.BigInteger;
public class Exercise10_17 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger(Long.MAX_VALUE + "");
        Long smallInteger = (long) Math.sqrt(Long.MAX_VALUE);
        int counter = 0;
        while (counter < 10) {
            smallInteger++;
            BigInteger bigSquare = new BigInteger(smallInteger + "");
            bigSquare = bigSquare.multiply(bigSquare);
            System.out.println(bigSquare);
            counter++;
        }
    }
}
