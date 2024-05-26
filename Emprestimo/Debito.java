package src;

public class VerificadorDebito {
    public boolean verificarDebito(int codigoAluno) {
        // Lógica para verificar se o aluno possui débito
        if (codigoAluno == 4) {
            return false;
        } else {
            return true;
        }
    }
}
