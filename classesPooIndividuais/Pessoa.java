package Exercicio;

public class Pessoa {
    protected String nome, endereco;
    protected String telefone;
    
//construtores
    public Pessoa(){
        System.out.println("Construtor padrão: Pessoa");
    }
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        System.out.println("Construtor parametrizado: Pessoa");
    }
    
// getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public double calcImpostoDeRenda(){
        return 0;
    }
}
