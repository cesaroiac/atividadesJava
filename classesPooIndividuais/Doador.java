package pratica01;

public class Doador {
    
    private String nome;
    private int idade;
    private String tipoSanguineo;
    private double peso;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getTipoSanguineo(){
        return this.tipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
    }

    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Nome: " + nome + "; Tipo Sanguíneo: " + tipoSanguineo;
    }
}
