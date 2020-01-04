public class isPrime
{
    //basic approach 
    public static void basicApproach(int number,int counter)
    {
        while(counter<=number-1)
        {
            if(number%counter==0)
            {
                System.out.println("Not Prime");
                return;
            }
            counter++;
        }
        System.out.println("Prime");
    }

    //Good Approach 
    public static void goodApproach(int number,int counter)
    {
        while(counter<=number/2)
        {
            if(number%counter ==0)
            {
                System.out.println("Not Prime");
                return ;
            }
            counter++;
        }
        System.out.println("Prime");
    }

    //Best Approach
    public static void bestApproach(int number,int counter)
    {
        while(counter*counter <=number)
        {
            if(number%counter==0)
            {
                System.out.println("Not Prime");
                return;
            }
            counter++;
        }
        System.out.println("Prime");
    }
    public static void main( String args[])
    {
        int number = 9;
        int counter =2;
        basicApproach(number, counter);
        goodApproach(number, counter);
        bestApproach(number, counter);

    }
}