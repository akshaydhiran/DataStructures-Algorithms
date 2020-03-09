public class printincreasing
{
    public static void main(String[] args)
    {
        increasingrecursion(5);
    }
    public static void increasingrecursion(int x)
    {
        if(x == 0)
        {
            return ;
        }
        increasingrecursion(x-1);
        System.out.println(x);
    }
}