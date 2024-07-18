
public class Processador {

    private String ins;
    private String atv;
    private int end;
    private String dados;
    String[] decod;

    UnidadeControle uc = new UnidadeControle();
    BancoRegistradores br = uc.getBr();
    ULA ula = new ULA(br);

    public String getIns() {
        return ins;
    }

    public void setIns(String ins) {
        this.ins = ins;
    }

    public String getAtv() {
        return atv;
    }

    public void setAtv(String atv) {
        this.atv = atv;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public UnidadeControle getUc() {
        return uc;
    }

    public void setUc(UnidadeControle uc) {
        this.uc = uc;
    }

    public BancoRegistradores getBr() {
        return br;
    }

    public void setBr(BancoRegistradores br) {
        this.br = br;
    }

    public ULA getUla() {
        return ula;
    }

    public void setUla(ULA ula) {
        this.ula = ula;
    }

    public int buscar1() {
        end = uc.buscarEndPc();
        System.out.println(br.toString());

        return end;
    }

    public void decodificar() {
        decod = this.ins.split(" ");
        System.out.println(br.toString());

    }

    public void buscar2() {
        br.setMbr(ins);
        br.setIr(br.getMbr());
        atv = decod[0];
        if (decod.length == 2) {
            end = Integer.parseInt(decod[1]);
        }
        System.out.println(br.toString());
    }

    public void processar() {
        if (atv.equals("CARR")) {
            br.setMar(end);
            br.setMbr(dados);
            br.setAcc(Integer.parseInt(dados));
            System.out.println(br.toString());

        }

        if (atv.equals("SOMA")) {
            br.setMar(end);
            ula.somar(dados);
            System.out.println(br.toString());

        }

        System.out.println(br.toString());

    }
}
