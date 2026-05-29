package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    //Exercicio 5
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        Double salario = leitura.nextDouble();

        Double salarioLiquido = salario + (salario * 0.05);

        System.out.printf("""
                Salário: %.2f
                Salário com comissão: %.2f
                """.formatted(salario, salarioLiquido));
    }
}
