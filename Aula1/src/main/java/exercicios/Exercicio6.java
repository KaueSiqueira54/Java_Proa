package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    //Exercicio 6
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o 1° valor: ");
        int valor1 = leitura.nextInt();

        System.out.println("Digite o 2° valor: ");
        int valor2 = leitura.nextInt();

        System.out.println("""
                Antes da troca:
                Valor 1 = %d
                Valor 2 = %d
                """.formatted(valor1, valor2));

        int troca;
        troca = valor1;
        valor1 = valor2;
        valor2 = troca;

        System.out.println("""
                Depois da troca:
                Valor 1 = %d
                Valor 2 = %d
                """.formatted(valor1, valor2));

    }
}
