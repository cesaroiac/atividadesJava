package exercicio;
import java.util.Scanner;

public class testeMusica {
    public static void main (String[]args){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o título da música: ");
        String titulo = leia.next();
        System.out.println("Informe a duração da música: ");
        Double duracao = leia.nextDouble();
        System.out.println("Informe o artista da música: ");
        String artista = leia.next();
        System.out.println("Informe o álbum da música: ");
        String album = leia.next();
        System.out.println("Informe o ano de lançamento da música: ");
        int ano = leia.nextInt();
        System.out.println("Informe o ranking em que a música se encontra: ");
        int ranking = leia.nextInt();
        
        Musica m1 = new Musica(titulo,duracao, artista, album, ano , ranking);
        
        Musica m2 = new Musica();
        m2.setTitulo("Ogay 2");
        m2.setDuracao(3.50);
        m2.setArtista("yagan");
        
        
        Musica m3 = new Musica();
    }
}
