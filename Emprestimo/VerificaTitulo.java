package src;

public class VerificaTitulo {
    public static Titulo obterTitulo(int codigo) {
        return new Titulo(codigo);
    }

    public static int obterPrazo(Titulo titulo) {
        return titulo.getPrazo();
    }
}