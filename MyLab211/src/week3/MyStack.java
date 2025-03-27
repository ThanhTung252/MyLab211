package week3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

// Class for Stack Operations
public class MyStack { 

    private List<Integer> stackValues;

    public MyStack() {
        stackValues = new ArrayList<>();
    }

    public void push(int value) {
        stackValues.add(value);
    }

    public int pop() {
        if (stackValues.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackValues.remove(stackValues.size() - 1);
    }

    public int get() {
        if (stackValues.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackValues.get(stackValues.size() - 1);
    }


}