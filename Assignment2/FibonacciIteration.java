import java.util.*;
public class FibonacciIteration {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of terms ");
        int n=sc.nextInt();
        int first=0, sec=1;
        System.out.println("Fibonacci using iteration  " );
        for(int i=0; i<n;i++)
        {
            System.out.println(first+" ");
            int next= first + sec;
            first=sec;
            sec=next;
        }
    }
}
