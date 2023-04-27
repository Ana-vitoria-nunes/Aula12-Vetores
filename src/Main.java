public class Main {
    public static void main(String[] args) {
        int vetor[] = new int[5];

        vetor[0]=4;
        vetor[1]=2;
        vetor[2]=2;
        vetor[3]=2;
        vetor[4]=5;

        int soma= vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4];

        System.out.println("A soma de "+vetor[0]+"+"+vetor[1]+"+"+vetor[2]+"+"+vetor[3]+"+"+vetor[4]+"= "+soma);
    }

}