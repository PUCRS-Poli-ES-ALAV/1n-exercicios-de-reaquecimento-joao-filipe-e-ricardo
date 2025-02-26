public class E7 {
    public static void main(String[]args)
    {
        int vet[] = {1,2,5};

        System.out.println(soma(vet));
        System.out.println(produto(vet));
    }

    public static int soma(int[] vet){
        if(vet.length == 0)return 0;
        int newVet[] = new int[vet.length-1];
        for(int i = 0; i < vet.length -1; i++){
            newVet[i] = vet[i];
        }

        return vet[vet.length-1] + soma(newVet);
    }

    public static int produto(int[] vet){
        if(vet.length == 0)return 1;
        int newVet[] = new int[vet.length-1];
        for(int i = 0; i < vet.length -1; i++){
            newVet[i] = vet[i];
        }

        return vet[vet.length-1] * produto(newVet);
    }
}
