package pl.coding.calculator.splitter;

import java.util.regex.Pattern;

class RPNChecker {
    
    private static final String stringPattern = "[\\d ]*[+-/*^]*";
    private static final Pattern pattern = Pattern.compile(stringPattern);
    
    static void checkNotationForLegalSigns(String notation) {
        var matcher = pattern.matcher(notation);
        
        if (!(matcher.matches())) {
            throw new IllegalArgumentException();
        }
    }
    
}
