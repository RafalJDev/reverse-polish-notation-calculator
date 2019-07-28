package pl.coding.calculator.splitter;

import pl.coding.calculator.entity.RPNEntity;

import java.util.regex.Pattern;

public class RPNSplitter {
    
    private final String stringPattern = "([\\d ]+)([+-/*^]+)";
    private final Pattern pattern = Pattern.compile(stringPattern);
    
    public RPNEntity extractRPNEntity(String notation) {
        var matcher = pattern.matcher(notation);
        
        if (!(matcher.matches())) {
            throw new IllegalArgumentException();
        }
        
        String[] numbers = matcher.group(1)
                                  .split(" ");
        
        String[] operations = matcher.group(2)
                                     .split(" ");
        
        shouldBeOneLessOperationThanNumbers(numbers.length, operations.length);
        
        return new RPNEntity(numbers, operations);
    }
    
    private void shouldBeOneLessOperationThanNumbers(int amountOfNumbers, int amountOfOperations) {
        if (amountOfNumbers - 1 != amountOfOperations) {
            throw new IllegalArgumentException();
        }
    }
    
}
