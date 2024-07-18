package Exercicio;

public class Produto {
    private long codigo;
    private String nome;
    
    public Produto(){
        
    }
    public Produto(long codigo, String nome){
       this.codigo = codigo;
       this.nome = nome;
    }
//Não necessita de getNome, mediante a existência do método acima...
    public String consultaNome(){
        return this.nome;
    }
    public long getCodigo(){
        return this.codigo;
    }  
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }   
}
