public class Celular {

    private String modelo;
    private String marca;
    private int memoria;
    private int bateria;
    private String cor;

    public void informacoes(){
        System.out.println("""
                Modelo: %s
                Marca; %s
                Memória: %d
                Bateria: %d
                Cor: %s
                """.formatted(modelo, marca, memoria, bateria, cor));
    }

    public Celular(String modelo, String marca, int memoria, int bateria, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.memoria = memoria;
        this.bateria = bateria;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
