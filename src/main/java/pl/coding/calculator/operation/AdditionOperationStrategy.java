package pl.coding.calculator.operation;

import java.math.BigInteger;

class AdditionOperationStrategy implements OperationStrategy {
    
    @Override
    public BigInteger calculateOperation(String firstNumber, String secondNumber) {
        return new BigInteger(firstNumber).add(new BigInteger(secondNumber));
    }
    
}
