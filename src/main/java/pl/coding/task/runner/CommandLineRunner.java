package pl.coding.task.runner;

import lombok.RequiredArgsConstructor;
import pl.coding.task.calculator.ReversePolishNotationCalculator;

import java.util.Scanner;

@RequiredArgsConstructor
public class CommandLineRunner {
    
    private final ReversePolishNotationCalculator calculator;
    
    private final Scanner scanner = new Scanner(System.in);
    
    public void run() {
        String input = "";
        
        //yea while true is not good
        while (true) {
            input = scanner.nextLine();
            
            writeMessage("Your input: " + input);
            
            if ("exit".equals(input)) {
                break;
            }
            String result = calculator.calculateResult(input);
            
            writeMessage("Result: " + result);
        }
    }
    
    public void writeMessage(String message) {
        System.out.println(message);
    }
    
}
