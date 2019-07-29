package pl.coding.task.calculator.operation;

import java.math.BigInteger;

class AdditionOperationStrategy implements OperationStrategy {
    
    @Override
    public BigInteger calculateOperation(String firstNumber, String secondNumber) {
        return new BigInteger(secondNumber).add(new BigInteger(firstNumber));
    }
    
}
