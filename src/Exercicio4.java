import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner QuantLista = new Scanner(System.in);
        int quant;
        System.out.println("Digite quantos produtos deseja inserir: ");
        quant=QuantLista.nextInt();

        String produto[]= new String[quant];

        for (int i = 0; i <quant; i++) {
            System.out.println("Digite o nome do produto: ");
            produto[i] =QuantLista.next();

        }
        System.out.println("------------Lista de Compras-------------");
        for (int i=0; i<produto.length; i++){
            System.out.println(produto[i]);
        }
    }
}
