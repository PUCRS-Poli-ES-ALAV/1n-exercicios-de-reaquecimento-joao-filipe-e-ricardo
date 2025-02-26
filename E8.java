public class E8 {
    public static void main(String[] args) {

        System.out.println(pal("a"));
    }

    public static boolean pal(String s)
    {
        if(s.length() <= 1) return true;
        if(s.charAt(0) == s.charAt(s.length() - 1) )
        {
        return pal(s.substring(1, s.length() - 1));
        }
        return false;
    }
}