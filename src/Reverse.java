public class Reverse
{

    public static boolean isExactReverse(String x, String y)
    {
        int c = 0;
        if (x.length() != y.length())
            return false;
        else
        {
            for (int i = x.length()-1;i>=0; i--)
            {
                if (x.charAt(i) != y.charAt(c))
                {
                    return false;
                }
                c++;
            }
        }
        return true;
    }
}
