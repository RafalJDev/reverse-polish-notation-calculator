package pl.coding.calculator.operation;

import java.math.BigInteger;

public interface OperationStrategy {
    
    BigInteger calculateOperation(String firstNumber, String secondNumber);
    
}
