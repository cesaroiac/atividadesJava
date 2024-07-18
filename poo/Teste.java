package Exercicio;
import java.util.Scanner;

public class Teste {
    public static void main (String[]args){
        Scanner leia = new Scanner (System.in);
        
        System.out.println("# Iniciando compra #");
        System.out.println("");
        System.out.println("# Preencha seu cadastro abaixo: #");
        System.out.println("");
        
        Produto p1 = new Produto(565 , "Miojo");
        Produto p2 = new Produto(856 , "Guaraná");
       
        System.out.println("Informe seu nome:");
        String nome = leia.nextLine();
        System.out.println("Informe seu número:");
        String numero = leia.nextLine();
        
        System.out.println("Informe seu endereço: (Logradouro)");
        String logradouro = leia.nextLine();
        System.out.println("Informe sua cidade: ");
        String cidade = leia.nextLine();
        System.out.println("Informe seu estado: ");
        String estado = leia.nextLine();
        
        System.out.println("");
        System.out.println("# Cadastro realizado com sucesso #");
        
       Endereco endereco = new Endereco(logradouro, cidade, estado);
       Pessoa pessoa = new Pessoa(nome, numero, endereco);
       Compra compra01 = new Compra();
       Compra compra02 = new Compra();
       
       
        System.out.println("");
        System.out.println("# Produtos disponíveis para compra: #");
        System.out.println("1° " + p1.consultaNome() + " " + p1.getCodigo());
        System.out.println("2° " + p2.consultaNome() + " " + p2.getCodigo());
        System.out.println("");
        
        System.out.println("Escolha seu produto usando '1'"
                + " para o primeiro e '2' para o segundo");
        int codigo = leia.nextInt();
        System.out.println("");
        
        if(codigo == 1){
            compra01.Comprar(pessoa, p1);
            System.out.println(compra01.verificarCompra(pessoa, p1));
        } 
        if(codigo == 2){
            compra02.Comprar(pessoa, p2);
            System.out.println(compra02.verificarCompra(pessoa, p2));
        }   
        System.out.println("");
        System.out.println("# Fim de execução da compra #");
    }
}
