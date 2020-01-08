    import java.util.Scanner;
    public class StringPalindrome
    {
        public static void main(String args[])
        {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean check = isPalindrome(str);
        System.out.println(check);
        printAllPalindromicSubsequence(str);
    }
    public static boolean isPalindrome(String str)
    {
        int left=0;
        int right = str.length()-1;
        while(left<=right)
        {
            if(str.charAt(left)!= str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void printAllPalindromicSubsequence(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                String ss = str.substring(i, j);
                if(isPalindrome(ss))
                {
                    System.out.println(ss);
                }
            }
        }
    }
}
