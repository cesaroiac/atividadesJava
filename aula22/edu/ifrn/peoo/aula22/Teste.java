package edu.ifrn.peoo.aula22;

public class Teste {

    public static void main(String[] args) {
        Carro carro = new Carro(0, 0, 0);
        carro.setCapacidadeTotal(100);
        carro.andar(40);
        System.out.println("Andou 40Km");
        carro.abastecer(30);
        System.out.println("Abasteceu 30 litros");
        System.out.println("O tanque possui: "+carro.consultarTanque()+" litros"); 
        
        Moto moto = new Moto(0, 0, 0);
        moto.setCapacidadeTotal(100);
        moto.andar(20);
        System.out.println("Andou 20Km");
        moto.abastecer(30);
        System.out.println("Abasteceu 30 litros");
        System.out.println("O tanque possui: "+moto.consultarTanque()+" litros");    
    }   
}
