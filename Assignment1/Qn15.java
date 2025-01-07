import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Qn15 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("one" ,"two" , "three" , "four" , "five"));

        System.out.println("iterate using for loop");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("iterate using an Iterator Interface");
        Iterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println("iterate using an for each with lamda expression ");
        list.forEach( element -> {System.out.print(element + " ");});


}}