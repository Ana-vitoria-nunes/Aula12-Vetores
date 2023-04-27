import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner NomeBanda= new Scanner(System.in);
       String banda;
        System.out.println("Digite o nome de alguma banda: ");
        banda=NomeBanda.next();

        String musica[]= new String[3];

        for (int i = 0; i <3; i++) {
            System.out.println("Digite uma música dessa banda: ");
            musica[i]=NomeBanda.next();

        }
        System.out.println("Nome da banda: "+banda);
        for (int i=0; i<musica.length; i++){
            System.out.println("Músicas"+i+": "+musica[i]);
        }
    }
}
