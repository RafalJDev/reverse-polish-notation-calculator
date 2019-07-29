package pl.coding.task.calculator.operation;

import java.math.BigInteger;

public class MultiplicationOperationStrategy implements OperationStrategy {
    
    @Override
    public BigInteger calculateOperation(String firstNumber, String secondNumber) {
        return new BigInteger(secondNumber).multiply(new BigInteger(firstNumber));
    }
    
}
