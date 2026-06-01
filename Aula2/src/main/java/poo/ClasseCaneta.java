package poo;

import com.sun.security.jgss.GSSUtil;

public class ClasseCaneta {

    private String modelo;
    private String cor;
    private String tipo;
    private String material;
    private float ponta;
    private float carga;
    private boolean tampa;

    void escrever() {
        if(carga > 0 && !tampa) {
            System.out.println("Escrevendo..");
        } else {
            System.out.println("Erro. Caneta sem carga.");
        }
    }

    void rabiscar() {
        if(carga > 0 && !tampa) {
            System.out.println("Rabiscando..");
        } else {
            System.out.println("Erro. Caneta sem carga.");
        }
    }

    void pintar() {
        if(carga > 0 && !tampa) {
            System.out.println("Pintando..");
        } else {
            System.out.println("Erro. Caneta sem carga.");
        }
    }

    void estado() {
        System.out.println("""
                Modelo: %s
                Cor: %s
                Tipo: %s
                Material: %s
                Ponta: %f
                Está tampada? %b
                """.formatted(modelo, cor, tipo, material, ponta, tampa));
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }
}
