import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
      
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        
        System.out.println("The unique numbers are: " + uniqueNumbers);
    }
}

