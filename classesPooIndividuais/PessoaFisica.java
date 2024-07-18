package Exercicio;
import java.util.Date;

public class PessoaFisica extends Pessoa{
    private String cpf, rg;
    private String dataNascimento;

//construtores
    public PessoaFisica(){
        super();
        System.out.println("Construtor padrão: PessoaFisica");
    }
    public PessoaFisica(String cpf, String rg, String dataNascimento,
        String nome, String endereco, String telefone){
        
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        System.out.println("Construtor parametrizado: PessoaFisica");
    }

// getters e setters
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }    
}
