package trabalhandotiposdedados;

public class Exemplo1 {
    public static void main(String[] args) {
        String nome = "Irineu Siqueira";
        int idade = 21;
        float altura = 1.69f;
        float peso = 69f;
        double salario = 80.000;
        boolean cor = true;

        System.out.println("""
                Dados pessoais:
                Nome: %s
                Idade: %d
                Altura: %f
                Peso: %f
                Salario: %f
                Pessoa preta? %b
                """.formatted(nome, idade, altura, peso, salario, cor));
    }
}
