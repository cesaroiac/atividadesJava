package exercicio;
import java.util.Scanner;

public class TestePessoa {
    public static void main(String[]args){
        Scanner leia = new Scanner (System.in);
        
        Pessoa Pessoa01 = new Pessoa("Lheui Cleiton", 25, "400-400-289-22");
        
        Pessoa Pessoa02 = new Pessoa();
        Pessoa02.setNome("Adeilçu Pereirax");
        Pessoa02.setIdade(52);
        Pessoa02.setCpf("123-321-222-00");
        
        System.out.println("Pessoa 01: ");
        System.out.println("Nome: "+ Pessoa01.getNome());
        System.out.println("Idade:"+ Pessoa01.getIdade());
        System.out.println("Cpf: "+ Pessoa01.getCpf());
        
        System.out.println("____________________________");
        
        System.out.println("Pessoa 02: ");
        System.out.println(Pessoa02.toString());
    }
}
