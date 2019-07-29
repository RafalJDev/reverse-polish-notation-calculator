package pl.coding.task;

import pl.coding.task.calculator.ReversePolishNotationCalculator;
import pl.coding.task.calculator.operation.OperationCalculator;
import pl.coding.task.calculator.splitter.RPNExtractor;
import pl.coding.task.runner.CommandLineRunner;

public class Main {
    
    public static void main(String[] args) {
        var calculator = new ReversePolishNotationCalculator(new RPNExtractor(),
                                                             new OperationCalculator());
        new CommandLineRunner(calculator).run();
    }
    
}
