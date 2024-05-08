public abstract class Bike implements Transporte{

    private String tipo;
    protected int carga;
    private Quadro quadro;
    private Roda rodaDianteira;
    private Roda rodaTraseira;

    
    public Bike(String tipo, int carga) {
        this.tipo = tipo;
        this.carga = carga;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public Quadro getQuadro() {
        return quadro;
    }
    public void setQuadro(Quadro quadro) {
        this.quadro = quadro;
    }
    public Roda getRodaDianteira() {
        return rodaDianteira;
    }
    public void setRodaDianteira(Roda rodaDianteira) {
        this.rodaDianteira = rodaDianteira;
    }
    public Roda getRodaTraseira() {
        return rodaTraseira;
    }
    public void setRodaTraseira(Roda rodaTraseira) {
        this.rodaTraseira = rodaTraseira;
    }

    @Override
    public String toString() {
        return "Bike [tipo=" + tipo + ", carga=" + carga + "]";
    }
    
    
}