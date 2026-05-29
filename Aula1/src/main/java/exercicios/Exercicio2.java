package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    //Exercicio 2
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite o raio do circulo: ");
        Double raio = leitura.nextDouble();

        Double area = Math.PI * raio * raio;
        Double perimetro = 2* Math.PI * raio;

        System.out.println("""
                Área: %.2f
                Perimetro: %.2f
                """.formatted(area, perimetro));

    }
}
