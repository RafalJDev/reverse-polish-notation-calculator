package pl.coding.calculator.operation;

import java.math.BigInteger;

class SubtractionOperationStrategy implements OperationStrategy {
    
    @Override
    public BigInteger calculateOperation(String firstNumber, String secondNumber) {
        return new BigInteger(firstNumber).subtract(new BigInteger(secondNumber));
    }
    
}
