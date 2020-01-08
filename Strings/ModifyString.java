import java.util.Scanner;

public class ModifyString
{
    public static void main(String args[])
    {
        System.out.println("Enter the String");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(modifystring(str));
    }
    public static String modifystring(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length()-1;i++)
        {
            char ch1= str.charAt(i);
            char ch2 = str.charAt(i+1);
            int diff = ch2 - ch1;

            sb.append(ch1);
            sb.append(diff);
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }
}