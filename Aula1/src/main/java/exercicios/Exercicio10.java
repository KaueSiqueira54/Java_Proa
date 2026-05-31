package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite seu salário: ");
        Double salario = leitura.nextDouble();

        Double novoSalario = salario + ((salario * 15) / 100);

        System.out.println("""
                Salário: %.2f
                Salário com aumento: %.2f
                """.formatted(salario, novoSalario));
    }
}
