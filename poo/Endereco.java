package Exercicio;

public class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;
    
    public Endereco(){
        
    }
    public Endereco(String logradouro, String cidade, String estado){
       this.logradouro = logradouro;
       this.cidade = cidade;
       this.estado = estado;
    }
    
//Não necessita de getLogradouro, mediante a existência do método acima...
    public String consultaLogradouro(){
        return this.logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }   
}
