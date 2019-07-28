package pl.coding.calculator.operation;

import java.math.BigInteger;

public class MultiplicationOperationStrategy implements OperationStrategy {
    
    @Override
    public BigInteger calculateOperation(String firstNumber, String secondNumber) {
        return new BigInteger(firstNumber).multiply(new BigInteger(secondNumber));
    }
    
}
