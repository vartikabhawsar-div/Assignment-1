import java.util.Scanner;
class EvenOdd {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
