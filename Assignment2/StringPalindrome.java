class StringPalindrome
{
    public static void main (String []args)
    {
        String str= "Kanak";
        String str1;
        String rev="";
        str1=str.toLowerCase();
        for(int i=str1.length()-1;i>=0 ; i--)
        {
            rev+=str1.charAt(i);

        }
        if(str1.equals(rev))
        {
            System.out.println("String in Palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}