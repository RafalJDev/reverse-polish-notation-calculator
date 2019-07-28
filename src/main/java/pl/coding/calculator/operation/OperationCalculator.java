package pl.coding.calculator.operation;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static pl.coding.calculator.operation.Operations.MINUS;
import static pl.coding.calculator.operation.Operations.MULTIPLY;
import static pl.coding.calculator.operation.Operations.PLUS;

public class OperationCalculator {
    
    Map<String, OperationStrategy> strategyMap;
    
    public OperationCalculator() {
        strategyMap = new HashMap<>();
        strategyMap.put(PLUS.getOperation(), new AdditionOperationStrategy());
        strategyMap.put(MINUS.getOperation(), new SubtractionOperationStrategy());
        strategyMap.put(MULTIPLY.getOperation(), new MultiplicationOperationStrategy());
    }
    
    public BigInteger calculateOperation(String firstNumber, String secondNumber, String operation) {
        return strategyMap.get(operation)
                          .calculateOperation(firstNumber, secondNumber);
    }
    
}
