package pl.coding.calculator.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;

import java.util.Deque;

@Value
@Getter(AccessLevel.NONE)
public class RPNEntity {
    
    Deque<String> numbers;
    
    Deque<String> operations;
    
    public String pollLastNumber() {
        return numbers.pollLast();
    }
    
    public void addNumber(String number) {
        numbers.add(number);
    }
    
    public boolean isNotLastNumber() {
        return numbers.size() != 1;
    }
    
    public String pollFirstOperation() {
        return operations.pollFirst();
    }
    
}
