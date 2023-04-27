import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner NumInteiro = new Scanner(System.in);
        int num[] = new int[10];

        for (int i = 0; i <10; i++) {
            System.out.println("Digite um número: ");
           num[i] = NumInteiro.nextInt();
        }
        System.out.println("-------------------------");
        for (int i=0; i<10; i++){
            if (num[i]%2==0)
            System.out.println("Números Pares: "+num[i]);
        }
    }
}
