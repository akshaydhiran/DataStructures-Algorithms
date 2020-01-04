public class nthFibonacci
{
    public static void main(String args[])
    {
        int n =6;
        int a=0;
        int b=1;
        int counter=1;
        while(counter<=n)
        {
            int c = a+b;
            a=b;
            b=c;
            counter++;
        }
        System.out.println(a);
    }
}