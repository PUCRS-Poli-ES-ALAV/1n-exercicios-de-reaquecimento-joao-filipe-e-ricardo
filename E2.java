public class E2 {
    public static void main (String[]args)
    {
        System.out.println(soma(2,10));
    }
    public static int soma(int a, int b)
    {
        if(a == 0 && b == 0) return 0;
        if(a != 0)
        return 1 + soma(a-1, b);
        else
            return 1 + soma(0, b-1);
    }
}