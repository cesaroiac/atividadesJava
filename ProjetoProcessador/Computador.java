
public class Computador {

    public static void main(String[] args) {

        Processador p = new Processador();
        Memoria m = new Memoria();
        m.inserirMem();
        System.out.println("Memória inicialmente:");
        for(int j=0; j < m.getMemoria().length; j++){
            System.out.println("P "+j+":"+m.getMemoria()[j]);
        }
        
        System.out.println("\n\n\nRegistradores inicialmente:");
        System.out.println(p.getBr().toString());
        System.out.println("\n\n");
        
        for (int i = 0; i <  m.getMemoria().length; i++) {
            System.out.println("Repetição "+i+":");
            m.setEnd(p.buscar1());
            p.setIns(m.getMemoria()[m.getEnd()]);
            p.decodificar();
            p.buscar2();
            m.setEnd(p.getEnd());
            p.setDados(m.getMemoria()[m.getEnd()]);
            p.processar();
            System.out.println("");

        }
        System.out.println("\n\n\n");
       
        for(int j=0; j < m.getMemoria().length; j++){
            System.out.println("P "+j+":"+m.getMemoria()[j]);
        }
        
        
    }
}
