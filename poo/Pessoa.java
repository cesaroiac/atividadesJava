package Exercicio;

public class Pessoa {
    private String nome;
    private String numero;
    private Endereco endereco;
//endereco esta para o atributo Endereco...
    
    public Pessoa(){
        
    }
    public Pessoa(String nome, String numero, Endereco endereco){
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
    }
    
    public Endereco consultaEndereco(){
        return this.endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public String consultaNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }    
}
