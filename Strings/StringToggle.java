import java.util.Scanner;
public class StringToggle
{
    public static void main(String args[])
    {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("String before Toggle "+str);
        System.out.println(togglestring(str));

        System.out.println("String before Toggle of Even and Odd");
        System.out.println(toggleEvenOdd(str));

    }
    public static String togglestring(String str)
    {
        StringBuilder sb  = new StringBuilder(str);
        for(int i=0;i<sb.length();i++)
        {
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                ch = (char) (ch - 'a'+ 'A');
            }
            else
            {
                ch = (char)(ch -'A' + 'a');
            }
            sb.setCharAt(i,ch);
        }
        return sb.toString();
    }

    public static String toggleEvenOdd(String str)
    {
        // FOR EVEN, -1 IN ASCII VALUE
        // FOR ODD, +1 IN ASCII VALUE
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++)
        {
            char ch = sb.charAt(i);
            if(i%2 ==0)
            {
                ch = (char)(ch -1);
            }
            else
            {
                ch =(char)(ch+1);
            }
            sb.setCharAt(i,ch);
        }
        return sb.toString();
    }
}