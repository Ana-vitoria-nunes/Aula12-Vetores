import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ValorIncerido = new Scanner(System.in);
        String aluno[] = new String[10];

        for (int i = 0; i <10; i++) {
            System.out.println("Digite o nome do aluno: ");
            aluno[i] = ValorIncerido.next();
        }
        System.out.println("------------Lista de alunos-------------");
        for (int i=0; i<10; i++){
            System.out.println(aluno[i]);
        }
    }
}
