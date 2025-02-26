public class E5 {
    public static void main(String[]args)
    {
        System.out.println(f(3));
    }
    public static int f(int n)
    {
        if(n == 1) return 1;
        if(n == 2) return 2;

        return (2 * f(n - 1) + 3 * f(n - 2));
    }
}
