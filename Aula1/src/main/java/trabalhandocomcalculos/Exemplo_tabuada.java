package trabalhandocomcalculos;

import java.util.Scanner;

public class Exemplo_tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número: \n");
        int numero = leitura.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("%d X %d = %d".formatted(numero, i, i * numero));
        }
    }
}
