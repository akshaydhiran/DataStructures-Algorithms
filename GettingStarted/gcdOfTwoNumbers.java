public class gcdOfTwoNumbers
{
    public static void main(String args[])
    {
        int n1= 18;
        int n2= 62;
        int rem= n2%n1;
        while(rem!=0)
        {
            n2 = n1;
            n1 = rem;
            rem = n2%n1;
        }
        System.out.println(n1);
    }
}