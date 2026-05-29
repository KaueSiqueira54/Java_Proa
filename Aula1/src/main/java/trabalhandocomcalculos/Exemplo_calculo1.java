package trabalhandocomcalculos;

import java.util.Scanner;

public class Exemplo_calculo1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        while (true) {

        System.out.println("Digite o número 1: \n");
        int numero1 = leitura.nextInt();

        System.out.println("Digite o número 2; \n");
        int numero2 = leitura.nextInt();

        System.out.println("""
                Digite a operação:
                
                1 = adição
                2 = subtração
                3 = multiplicação
                4 = divisão
                5 - Sair
                """);
        int operacao = leitura.nextInt();

        if (operacao == 1) {
            System.out.println("A soma de %d + %d = %d".formatted(numero1, numero2, (numero1 + numero2)));
        } else if (operacao == 2) {
            System.out.println("A subtração de %d - %d = %d".formatted(numero1, numero2, (numero1 - numero2)));
        } else if (operacao == 3) {
            System.out.println("A multiplicação de %d * %d = %d".formatted(numero1, numero2, (numero1 * numero2)));
        } else if (operacao == 4) {
            System.out.println("A divisão de %d / %d = %.2f".formatted(numero1, numero2, ((double) numero1 / numero2)));
        } else if (operacao == 5) {
            System.out.println("Finalizando o sistema..");
            break;
        } else {
            System.out.println("Algo deu errado, tente novamente!");
        }
    }
    }
}
