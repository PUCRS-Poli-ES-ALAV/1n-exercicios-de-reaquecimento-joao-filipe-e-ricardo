public class E1 {
    public static void main(String[] args) {
        System.out.println(mult(5,4));
    }

    public static int mult(int a, int b){
        if (b == 0) return 0;
        return a + mult(a, b-1);
    }
}
