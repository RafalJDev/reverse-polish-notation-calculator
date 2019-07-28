package pl.coding.calculator;

import lombok.RequiredArgsConstructor;
import pl.coding.calculator.entity.RPNEntity;
import pl.coding.calculator.operation.OperationCalculator;
import pl.coding.calculator.splitter.RPNExtractor;

import java.math.BigInteger;

@RequiredArgsConstructor
public class ReversePolishNotationCalculator {
    
    private final RPNExtractor extractor;
    
    private final OperationCalculator operationCalculator;
    
    public String calculateResult(String notation) {
        var rpnEntity = extractor.extractRPNEntity(notation);
        
        return calculateAllOperations(rpnEntity);
    }
    
    private String calculateAllOperations(RPNEntity rpnEntity) {
        while (rpnEntity.isNotLastNumber()) {
            var lastNumber = rpnEntity.pollLastNumber();
            var oneBeforeLastNumber = rpnEntity.pollLastNumber();
            
            var operation = rpnEntity.pollFirstOperation();
            
            BigInteger currentResult = operationCalculator.calculateOperation(lastNumber, oneBeforeLastNumber, operation);
            
            rpnEntity.addNumber(currentResult.toString());
        }
        
        return rpnEntity.pollLastNumber();
    }
    
}
