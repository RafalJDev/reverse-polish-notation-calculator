package pl.coding.task.calculator.splitter;

import pl.coding.task.calculator.entity.RPNEntity;

import java.util.regex.Pattern;

import static pl.coding.task.calculator.utill.CollectionConverter.convertArrayToDeque;

public class RPNExtractor {
    
    private final String stringPattern = "([-\\d ]+) ([+-/*^ ]+)";
    private final Pattern pattern = Pattern.compile(stringPattern);
    
    public RPNEntity extractRPNEntity(String notation) {
        var matcher = pattern.matcher(notation);
        
        if (!(matcher.matches())) {
            throw new IllegalArgumentException("Bad format of notation: " + notation);
        }
        
        String[] numbers = matcher.group(1)
                                  .split(" ");
        
        String[] operations = matcher.group(2)
                                     .split(" ");
    
        shouldBeOneLessOperationThanNumbers(numbers.length, operations.length, notation);
    
        //todo to factory ?
        return new RPNEntity(convertArrayToDeque(numbers), convertArrayToDeque(operations));
    }
    
    private void shouldBeOneLessOperationThanNumbers(int amountOfNumbers, int amountOfOperations, String notation) {
        if (amountOfNumbers - 1 != amountOfOperations) {
            throw new IllegalArgumentException("There should be one operation less than numbers, notation: " + notation);
        }
    }
    
}
