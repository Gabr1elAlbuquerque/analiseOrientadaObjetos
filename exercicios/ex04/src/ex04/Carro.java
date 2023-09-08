package ex04;

public class Carro {
    
    private String modelo;
    private String montadora;
    private String cor;
    private int anoFabricacao;

    public Carro() {
    }

    public Carro(String modelo, String montadora, String cor, int anoFabricacao) {
        this.modelo = modelo;
        this.montadora = montadora;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    public String statusCarro(){
        String status = "Modelo: "+this.getModelo()+"\n Montadora: "+this.getMontadora()+"\n Cor: "+this.getCor()+ "\n Ano: "+this.getAnoFabricacao()+"\n";
        return status;
    }
}
