package pratica01;
import java.util.Scanner;

public class testeDoador {
    
    public static void main (String[]args){
        Scanner leia = new Scanner(System.in);
        
         Doador doador01 = new Doador();
         
         System.out.println("Informe seu nome:");
         doador01.setNome(leia.next());
         
         System.out.println("Informe sua idade:");
         doador01.setIdade(leia.nextInt());
         
         System.out.println("Informe seu tipo sanguíneo:");
         doador01.setTipoSanguineo(leia.next());
         
         System.out.println("Informe seu peso:");
         doador01.setPeso(leia.nextDouble());
         
         System.out.println("");
         System.out.println("Dados do primeiro objeto: ");
         System.out.println("Nome: "+doador01.getNome());
         System.out.println("Idade: "+doador01.getIdade());
         System.out.println("Tipo sanguíneo: "+doador01.getTipoSanguineo());
         System.out.println("Peso: "+doador01.getPeso());
         //-----------------------------------------//
         Doador doador02 = new Doador();
         
         doador02.setNome("Adailçu Pereirax");
         doador02.setIdade(46);
         doador02.setTipoSanguineo("A+");
         doador02.setPeso(62.50);
         
         System.out.println("");
         System.out.println("Dados do segundo objeto: ");
         System.out.println(doador02.toString());
  }
}
