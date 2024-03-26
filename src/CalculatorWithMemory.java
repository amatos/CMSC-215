public class CalculatorWithMemory extends Calculator {
    private double memory;

    public CalculatorWithMemory() {
        this.memory = 0;
    }

    public void save() {
        this.memory = this.accumulator;
    }

    public void recall() {
        this.accumulator = this.memory;
    }

    public void clearMemory() {
        this.memory = 0;
    }

    public double getMemory() {
        return this.memory;
    }
}
