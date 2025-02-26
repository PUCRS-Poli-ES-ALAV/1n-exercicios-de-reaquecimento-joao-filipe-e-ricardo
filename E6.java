public class E6 {
    public static void main(String[]args)
    {
        System.out.println(ackerman(3,2));
    }
    public static int ackerman(int m, int n)
    {
        if(m == 0) return n+1;
        if(m != 0 && n == 0) return ackerman(m-1,1);
        return ackerman(m - 1, ackerman(m, n - 1));

    }
}
