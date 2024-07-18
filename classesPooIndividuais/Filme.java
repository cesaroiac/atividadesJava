package exercicio;

public class Filme {
    private String titulo;
    private String tituloOriginal;
    private String classificacao;
    private int duracao;
    private String genero;
    private String diretor;
    private int ano;
    
     public Filme(){
        
    }
    public Filme(String titulo, String tituloOriginal, String classificacao
    , String genero,String diretor, int ano, int duracao){
        
        this.titulo = titulo;
        this.tituloOriginal = tituloOriginal;
        this.classificacao = classificacao;
        this.genero = genero;
        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloOriginal() {
        return this.tituloOriginal;
    }
    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getClassificacao() {
        return this.classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return this.duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public String toString() {
        return "Titulo: " + titulo + "; Duração: "
        + duracao + "; Gênero: " + genero;
    } 
}