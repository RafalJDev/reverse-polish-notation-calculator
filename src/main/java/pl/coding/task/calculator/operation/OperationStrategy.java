package pl.coding.task.calculator.operation;

import java.math.BigInteger;

public interface OperationStrategy {
    
    //todo change hardcoded 2 number to list of numbers ? e.g. for power calculation
    BigInteger calculateOperation(String firstNumber, String secondNumber);
    
}
