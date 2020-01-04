public class allFibonacciTillN
{
    //Finds all fibonacci till nth number 
    public static void main(String args[])
    {
        
        int n =80;
        int a=0;
        int b=1;
        while(a<=n)
        {
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}