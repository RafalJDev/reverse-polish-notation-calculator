package pl.coding.task.calculator.operation;

import java.math.BigInteger;

class SubtractionOperationStrategy implements OperationStrategy {
    
    @Override
    public BigInteger calculateOperation(String firstNumber, String secondNumber) {
        return new BigInteger(secondNumber).subtract(new BigInteger(firstNumber));
    }
    
}
