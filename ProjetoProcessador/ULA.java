
public class ULA {
    
    private BancoRegistradores br ;

    public ULA(BancoRegistradores br) {
       this.br = br;
    }

    public BancoRegistradores getBr() {
        return br;
    }

    public void setBr(BancoRegistradores br) {
        this.br = br;
    }
    
    
    public void somar(String dado){
      br.setMbr(dado);
      br.setAcc(br.getAcc() + Integer.parseInt(br.getMbr()));
    }
        
}
