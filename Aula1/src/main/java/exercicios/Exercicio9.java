package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        System.out.println("Anos: ");
        int anos = leitura.nextInt();

        System.out.println("Meses: ");
        int meses = leitura.nextInt();

        System.out.println("Dias: ");
        int dias = leitura.nextInt();

        int diasVididos = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem %d dias de vida".formatted(diasVididos));
    }
}
