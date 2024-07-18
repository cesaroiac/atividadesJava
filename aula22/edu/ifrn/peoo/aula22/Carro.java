package edu.ifrn.peoo.aula22;

public class Carro implements IVeiculo {

    private int consumoLitros;
    private int capacidadeTotal;
    private int tanque;
//Construtores
    public Carro() {

    }

    public Carro(int consumoLitros, int capacidadeTotal, int tanque) {
        this.consumoLitros = consumoLitros;
        this.capacidadeTotal = capacidadeTotal;
        this.tanque = tanque;
    }
//Getters e Stetters

    public int getConsumoLitros() {
        return this.consumoLitros;
    }

    public void setConsumoLitros(int consumoLitros) {
        this.consumoLitros = consumoLitros;
    }

    public int getCapacidadeTotal() {
        return this.capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getTanque() {
        return this.tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }
//Métodos da classe mãe     

    
    @Override
    public void andar(int distancia) {
        tanque = tanque - distancia;
    }

    @Override
    public void abastecer(int litros) {
        tanque = tanque + litros;
    }

    @Override
    public double consultarTanque() {
        return this.tanque;
    }
}
