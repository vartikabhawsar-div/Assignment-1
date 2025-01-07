import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyofWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String s[] = str.split(" ");
        //System.out.println(s.length);

        Map<String , Integer> m = new HashMap<>();
        for (String string : s) {// my name is prabhat what is yours
            m.put(string , m.getOrDefault(string,0) + 1);
        }

        for(Map.Entry<String , Integer> map : m.entrySet())
        {
            System.out.println("frequency of "+map.getKey()+" is "+map.getValue());
}

    }
}