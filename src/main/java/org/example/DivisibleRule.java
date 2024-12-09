package org.example;

public class DivisibleRule implements Rule {

    private final int divisor;
    private final String output;

    public DivisibleRule(int divisor, String output) {
        this.divisor = divisor;
        this.output = output;
    }

    @Override
    public boolean applies(int number) {
        return number % divisor == 0;
    }

    @Override
    public String getOutput() {
        return output;
    }
}
