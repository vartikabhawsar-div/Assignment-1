import java.util.*;
class FibonacciRecurion
{
    public static int fibonacci(int n)
    
    {
        if(n<=1)
        {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main (String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of terms ");
        int n=sc.nextInt();
        System.out.println("fibonacci using recursion ");
        for(int i=0; i<n;i++)
        {
            System.out.println(fibonacci(i)+" ");       }
    }
}