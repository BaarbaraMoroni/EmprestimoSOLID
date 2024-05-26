package src;

public class VerificadorDebito {
    public boolean verificarDebito(Aluno aluno) {
        Debito debito = new Debito(Integer.parseInt(aluno.getNome()));
        return debito.verificaDebito();
    }
}