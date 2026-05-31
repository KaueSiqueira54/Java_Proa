package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Depósito mensal (R$): ");
        double deposito = leitura.nextDouble();
        System.out.print("Taxa de juros mensal (%): ");
        double taxa = leitura.nextDouble() / 100;

        double saldo = 0;
        for (int mes = 1; mes <= 12; mes++) {
            double juros = saldo * taxa;
            saldo = saldo + deposito + juros;
            System.out.printf("Mês %2d: R$ %.2f%n", mes, saldo);
        }
        System.out.printf("Montante final: R$ %.2f%n", saldo);
    }
}
