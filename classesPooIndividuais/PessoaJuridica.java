package Exercicio;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String inscrMunicipal;
    private String inscrEstadual;

//construtores
    public PessoaJuridica(){
        super();
        System.out.println("Construtor padrão: PessoaJuridica");
    }
    public PessoaJuridica(String cnpj, String inscrMunicipal,
        String inscrEstadual, String nome, String endereco, String telefone){
        
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscrMunicipal = inscrMunicipal;
        this.inscrEstadual = inscrEstadual;
        System.out.println("Construtor parametrizado: PessoaJuridica");
    }
    
// getters e setters
    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscrMunicipal() {
        return this.inscrMunicipal;
    }

    public void setInscrMunicipal(String inscrMunicipal) {
        this.inscrMunicipal = inscrMunicipal;
    }

    public String getInscrEstadual() {
        return this.inscrEstadual;
    }

    public void setInscrEstadual(String inscrEstadual) {
        this.inscrEstadual = inscrEstadual;
    }
}
