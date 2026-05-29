package trabalhandocomcalculos;

import java.util.Scanner;

public class Exemplo_imc {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu peso: \n");
        Double peso = leitura.nextDouble();

        System.out.println("Digite sua altura: \n");
        Double altura = leitura.nextDouble();

        Double imc = peso / (altura * altura);

        System.out.println("""
                Peso: %.2f
                Altura: %.2f
                IMC = %.2f
                """.formatted(peso, altura, imc));
    }
}
