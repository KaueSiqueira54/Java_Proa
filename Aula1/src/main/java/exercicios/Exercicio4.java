package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    //Exercicio 4
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a 1° nota do aluno (peso 2): ");
        Double nota1 = leitura.nextDouble();

        System.out.println("Digite a 2° nota do aluno (peso 3): ");
        Double nota2 = leitura.nextDouble();

        System.out.println("Digite a 3° nota do aluno (peso 5): ");
        Double nota3 = leitura.nextDouble();

        Double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);

        System.out.println("A média ponderada é: %.2f".formatted(mediaPonderada));
    }
}
