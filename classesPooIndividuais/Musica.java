package exercicio;

public class Musica {
    private String titulo;
    private Double duracao;
    private String artista;
    private String album;
    private int anoDeLancamento;
    private int ranking;
    
    public Musica(){
        
    }
    public Musica(String titulo, Double duracao, String artista,
        String album, int anoDeLancamento, int ranking){
        
        this.titulo = titulo;
        this.duracao = duracao;
        this.artista = artista;
        this.album = album;
        this.anoDeLancamento = anoDeLancamento;
        this.ranking = ranking;
        
    }
    
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public Double getDuracao(){
        return this.duracao;
    }
    public void setDuracao(Double duracao){
        this.duracao = duracao;
    }
    
    public String getArtista(){
        return this.artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public String getAlbum(){
        return this.album;
    }
    public void setAlbum(String album){
        this.album = album;
    }

    public int getAnoDeLancamento(){
        return this.anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getRanking(){
        return ranking;
    }
    public void setRanking(int ranking){
        this.ranking = ranking;
    }
   
    public String toString() {
        return "Título: "+titulo+"; duração: "+duracao+
               "; artista: "+artista+"; álbum: "+album+
               "; ano de lançamento: "+anoDeLancamento+
               "; ranking: "+ranking+".";
    }   
}
