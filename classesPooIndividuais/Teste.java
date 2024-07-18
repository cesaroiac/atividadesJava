package Exercicio;

public class Teste {
    public static void main (String[]args){
        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        //Saída:
        //Construtor padrão: Pessoa 
        //( Mensagem do construtor padrâo de Pessoa -> objeto p )
        
        //Construtor padrão: Pessoa
        //( Mensagem do construtor padrâo de Pessoa -> objeto pf
        // ,pois, antes de ser executado o construtor da subclasse,
        // foi executado o da superclasse, mediante a herança )
        
        //Construtor padrão: PessoaFisica
        //( Mensagem do construtor padrâo de PessoaFisica -> objeto pf )
        
        //Construtor padrão: Pessoa
        //( Mensagem do construtor padrâo de Pessoa -> objeto pj
        // ,pois, antes de ser executado o construtor da subclasse,
        // foi executado o da superclasse, mediante a herança )
        
        //Construtor padrão: PessoaJuridica
        //( Mensagem do construtor padrâo de PessoaJuridica -> objeto pj )
        
        //    p.setCPF(); 
//P é um objeto da superclasse Pessoa, sendo assim, 
//não contem o método da classe PesoaFisica, 
//mediante o fato da mesma ser uma subclasse que herda de Pessoa. 
        //   p.setCNPJ();
//P é um objeto da superclasse Pessoa, 
//sendo assim, não contem o método da classe PesoaJuridica, 
//mediante o fato da mesma ser uma subclasse que herda de Pessoa.
    }
}
