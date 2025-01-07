import java.util.Scanner;
public class Prime
{
    public static void main(String args[])
    {
        int n;
        boolean isPrime= true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        n=sc.nextInt(); 
        for (int i= 2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                isPrime= false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(n+" is Prime");
        }
        else 
        {
            System.out.println(n+" is not Prime");
        }
        }
}
