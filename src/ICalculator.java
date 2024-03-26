public class ICalculator {
    int CurrentValue;

    public ICalculator() {
        CurrentValue = 0;
    }

    public int add(int value) {
        CurrentValue += value;
        return CurrentValue;
    }

    public int sub(int value) {
        CurrentValue -= value;
        return CurrentValue;
    }

    public int mul(int value) {
        CurrentValue *= value;
        return CurrentValue;
    }

    public int div(int value) {
        CurrentValue /= value;
        return CurrentValue;
    }
}
