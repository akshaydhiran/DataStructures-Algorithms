public class nthFibonacci
{
    //find nth fibonacci
    public static void main(String args[])
    {
        int n =2;
        int a=0;
        int b=1;
        int counter=1;
        System.out.println(a);
        System.out.println(b);
        while(counter<=n)
        {
            int c = a+b;
            a=b;
            b=c;
            counter++;
            System.out.println(b);
        }
     //   System.out.println(a);
    }
}