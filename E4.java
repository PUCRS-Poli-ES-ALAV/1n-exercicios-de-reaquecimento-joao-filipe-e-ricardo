

public class E4 {
    public static void main(String[]args)
    {
        System.out.println(inverte("steam"));
    }
    public static String inverte(String s)
    {
        if(s.length() == 0) return "";
        return s.charAt(s.length() - 1) + inverte(s.substring(0, s.length() - 1));
    }
}
