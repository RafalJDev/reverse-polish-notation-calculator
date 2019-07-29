package pl.coding.task.calculator.operation;

enum Operations {
    
    PLUS("+"), MINUS("-"), MULTIPLY("*");
    
    private final String operation;
    
    Operations(String operation) {
        this.operation = operation;
    }
    
    String getOperation() {
        return operation;
    }
    
}
