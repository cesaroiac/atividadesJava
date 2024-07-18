public class calculadora{
    
    private calculadora() {
    
    }
    /***
     * Realiza a soma entre 2 números
     * @param v1 = prieiro valor
     * @param v2 = segundo valor
     * @return 
     */
    public static double soma(Double v1, Double v2){
        return v1 + v2;
    }
    public static double subtracao(Double v1, Double v2){
        return v1 - v2;
    }
    public static double multiplicacao(Double v1, Double v2){
        return v1 * v2;
    }
    public static double divisao(Double v1, Double v2){
        return v1 / v2;
    }
}
