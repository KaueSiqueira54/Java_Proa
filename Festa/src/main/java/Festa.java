public class Festa {

    private String data;
    private String local;
    private String endereco;
    private String aniversariante;
    private int idade;

    public void aniversario() {
        System.out.println("""
                Data: %s
                Local: %s
                Endereço: %s
                Aniversariante:%s
                Idade: %d
                """.formatted(data, local, endereco, aniversariante, idade));
    }

    public Festa(String data, String local, String endereco, String aniversariante, int idade) {
        this.data = data;
        this.local = local;
        this.endereco = endereco;
        this.aniversariante = aniversariante;
        this.idade = idade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getAniversariante() {
        return aniversariante;
    }

    public void setAniversariante(String aniversariante) {
        this.aniversariante = aniversariante;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
