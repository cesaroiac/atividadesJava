package jobzin;

public class Lampada {
    
   private int potencia;
   private String tipo;
   private Boolean estaAcesa;
    
   public int getPotencia(){
       return this.potencia;
   }
   
   public void setPotencia(int potencia){
       this.potencia = potencia;
   }

   public String getTipo(){
       return this.tipo;
   }
   
   public void setTipo(String tipo){
       this.tipo = tipo;
   }
   
   public void ascender(){
       estaAcesa = true;
   }
   public void apagar(){
       estaAcesa = false;
   }

    public String toString() {
        return "Potência: " + potencia + "; Tipo: " + tipo + "; Está acesa? " + estaAcesa;
    }
   
   
}
