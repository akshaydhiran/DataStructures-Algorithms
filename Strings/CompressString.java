
public class CompressString
{
    public static void main(String args[])
    {
        String str = "aaabbbbccbbdddeefffff";

        System.out.println("Compress 1 "+normalCompress(str));

        System.out.println("Design Count Compress 2 "+countingCompress(str));
    }
    public static String normalCompress(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length()-1;i++)
        {
            char ch1 = str.charAt(i);
            char ch2= str.charAt(i+1);
            if(ch1 != ch2)
            {
                sb.append(ch1);
            }
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }

    public static String countingCompress(String str)
    {
        int counter =1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length()-1;i++)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if(ch1 != ch2)
            {
                if(counter >1)
                {
                    sb.append(ch1);
                    sb.append(counter);
                }
                counter=1;
            }
            else
            {
                counter ++;
            }
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }
}