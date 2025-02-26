public class E3 {

    public static void main(String[]args){
        System.out.println(sum(3));
    }

    public static double sum(int n){
        if(n == 0) return 0;
        return (1.0/n) + sum(n-1);
    }
}
