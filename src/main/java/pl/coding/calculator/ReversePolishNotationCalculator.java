package pl.coding.calculator;

import lombok.RequiredArgsConstructor;
import pl.coding.calculator.entity.RPNEntity;
import pl.coding.calculator.splitter.RPNSplitter;

@RequiredArgsConstructor
public class ReversePolishNotationCalculator {
    
    private final RPNSplitter splitter;
    
    public int calculateValue(String notation) {
        RPNEntity rpnEntity = splitter.extractRPNEntity(notation);
        
        return 0;
    }
    
}
