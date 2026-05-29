package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite a base do triângulo:");
        Double base = leitura.nextDouble();

        System.out.println("Digite a altura do triângulo:");
        Double altura = leitura.nextDouble();

        System.out.println("""
                Base: %.2f
                Altura: %.2f
                Área: %.2f
                """.formatted(base, altura, (base * altura) / 2));
    }
}
