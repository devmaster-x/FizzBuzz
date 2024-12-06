package org.example;

public interface Rule {
    boolean applies(int number);
    String getOutput();
}
