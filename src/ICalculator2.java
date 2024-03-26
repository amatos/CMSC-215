public class ICalculator2 extends ICalculator {


    public int negate() {
        CurrentValue = -CurrentValue;
        return CurrentValue;
    }
    public int square(int value) {
        CurrentValue = value * value;
        return CurrentValue;
    }

    public int cube(int value) {
        CurrentValue = value * value * value;
        return CurrentValue;
    }

    public int power(int value, int power) {
        CurrentValue = (int) Math.pow(value, power);
        return CurrentValue;
    }

    public int factorial(int value) {
        CurrentValue = 1;
        for (int i = 1; i <= value; i++) {
            CurrentValue *= i;
        }
        return CurrentValue;
    }
}
