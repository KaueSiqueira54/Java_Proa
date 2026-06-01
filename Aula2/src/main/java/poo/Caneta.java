package poo;

public class Caneta extends ClasseCaneta{
    public static void main(String[] args) {
        ClasseCaneta caneta1 = new ClasseCaneta();

        caneta1.setModelo("Bic");
        caneta1.setCor("Preta");
        caneta1.setTipo("Esferográfica");
        caneta1.setCarga(100);
        caneta1.setPonta(0.5f);
        caneta1.setTampa(false);

        caneta1.estado();
        caneta1.escrever();
        caneta1.rabiscar();
        caneta1.pintar();

        ClasseCaneta caneta2 = new ClasseCaneta();

        caneta2.setModelo("Bic");
        caneta2.setCor("Vermelha");
        caneta2.setTipo("Esferográfica");
        caneta2.setCarga(0);
        caneta2.setPonta(0.5f);
        caneta2.setTampa(true);

        caneta2.estado();
        caneta2.escrever();
        caneta2.rabiscar();
        caneta2.pintar();
    }
}
