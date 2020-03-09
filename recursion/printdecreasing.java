public class printdecreasing
{
    public static void main(String[] args)
    {
        decreasingrecursion(5);
    }
    public static void decreasingrecursion(int n)
    {
        if(n == 0)
        {
            return ;
        }
        System.out.println(n);
        decreasingrecursion(n-1);
    }
}