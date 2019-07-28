package pl.coding.calculator.entity;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RPNEntity {
    
    private final Stack<String> numbers;
    
    private final Stack<String> operations;
    
    public RPNEntity(String[] numbers, String[] operations) {
        this.numbers = new Stack();
        this.numbers.addAll(Stream.of(numbers)
                                  .collect(Collectors.toList()));
        
        this.operations = new Stack();
        this.operations.addAll(Stream.of(operations)
                                     .collect(Collectors.toList()));
    }
    
}
