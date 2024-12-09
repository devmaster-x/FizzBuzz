package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzEngine {

    private final List<Rule> rules = new ArrayList<>();

    public FizzBuzzEngine() {
        // Default rules
        addRule(new DivisibleRule(3, "Fizz"));
        addRule(new DivisibleRule(5, "Buzz"));
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public String execute(int value) {
        StringBuilder result = new StringBuilder();
        for (Rule rule : rules) {
            if (rule.applies(value)) {
                result.append(rule.getOutput());
            }
        }
        return result.isEmpty() ? String.valueOf(value) : result.toString();
    }
}
