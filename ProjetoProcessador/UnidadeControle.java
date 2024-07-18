
public class UnidadeControle {
    
    private BancoRegistradores br;

    public UnidadeControle() {
        br = new BancoRegistradores();
    }

    public BancoRegistradores getBr() {
        return br;
    }

    public void setBr(BancoRegistradores br) {
        this.br = br;
    }
    
    
    public int buscarEndPc(){
        br.setMar(br.getPc());
        br.setPc(br.getPc()+1);
        return br.getMar(); 
    }
     
    public String[] dec(String ins ){
        String[] d = ins.split(" ");
        return d;
    }
    
    
    
    
}
