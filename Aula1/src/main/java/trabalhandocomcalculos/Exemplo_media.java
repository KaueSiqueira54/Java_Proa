package trabalhandocomcalculos;

import java.util.Scanner;

public class Exemplo_media {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a nota 1: \n");
        Double nota1 = leitura.nextDouble();

        System.out.println("Digite a nota 2: \n");
        Double nota2 = leitura.nextDouble();

        System.out.println("""
                Nota 1 = %.2f
                Nota 2 = %.2f
                Média = %.2f
                """.formatted(nota1, nota2, ((nota1 + nota2) / 2)));
    }
}
