package Exercicio;

public class Compra {
    private Pessoa pessoa;
    private Produto produto;
    
    public Compra(){
        
    }
//comprar exerce o papel dos sets...
    public void Comprar(Pessoa pessoa, Produto produto){
        this.pessoa = pessoa;
        this.produto = produto;
    }
    
    public String verificarCompra(Pessoa pessoa, Produto produto){
        return "O cliente: "+pessoa.consultaNome() + " comprou um " + 
        produto.consultaNome() + " que será entregue em " 
        + pessoa.consultaEndereco().consultaLogradouro()+
        "; cidade: "+pessoa.consultaEndereco().getCidade()+
        " e estado: "+pessoa.consultaEndereco().getEstado();
    }

    public Pessoa getPessoa(){
        return this.pessoa;
    }
    public Produto getProduto() {
        return this.produto;
    }  
}
