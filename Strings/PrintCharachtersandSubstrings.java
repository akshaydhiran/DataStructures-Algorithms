public class PrintCharachtersandSubstrings
{
    public static void main(String args[])
    {
        String str ="Hello";
        printCharacters(str);
        printSubstrings(str);
    }
    public static void printCharacters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
    public static void printSubstrings(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}