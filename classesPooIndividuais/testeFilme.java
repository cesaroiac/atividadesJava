package exercicio;
import java.util.Scanner;

public class testeFilme {
    public static void main(String[]args){
        Scanner leia = new Scanner (System.in);
        Filme f1 = new Filme();
        System.out.println("Informe o título do filme: ");
        String titulo = leia.next();
        System.out.println("Informe o título original do filme: ");
        String tituloOriginal = leia.next();
        System.out.println("Informe a classificação do filme: ");
        String classificacao = leia.next();
        System.out.println("Informe o gênero do filme: ");
        String genero = leia.next();
        System.out.println("Informe o diretor do filme: ");
        String diretor = leia.next();
        System.out.println("Informe o ano de lançamento do filme: ");
        int ano = leia.nextInt();
        System.out.println("Informe a duração do filme: ");
        int duracao = leia.nextInt();
    }
}
