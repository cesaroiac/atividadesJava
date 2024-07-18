import java.util.Scanner;
public class testeCalculadora {
    public static void main (String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        Double v1 = leia.nextDouble();
        System.out.println("Informe o segundo valor: ");
        Double v2 = leia.nextDouble();
        System.out.println("");
        System.out.println("Soma: " + calculadora.soma(v1, v2));
        System.out.println("Subtração: " + calculadora.subtracao(v1, v2));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(v1, v2));
        System.out.println("Divisão: " + calculadora.divisao(v1, v2));
    }
}
