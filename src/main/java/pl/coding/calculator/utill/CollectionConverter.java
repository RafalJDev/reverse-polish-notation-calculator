package pl.coding.calculator.utill;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionConverter {
    
    public static Deque convertArrayToDeque(String[] array) {
        Deque deque = new LinkedList();
        deque.addAll(Stream.of(array)
                           .collect(Collectors.toList()));
        return deque;
    }
    
}
