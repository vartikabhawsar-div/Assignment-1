import java.util.*;

public class maxValue {
    public static void main(String[] args) {
      
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(30);
        numbers.add(25);

       
        int maxValue = Collections.max(numbers);

        
        System.out.println("The maximum value in the list is: " + maxValue);
    }
}
