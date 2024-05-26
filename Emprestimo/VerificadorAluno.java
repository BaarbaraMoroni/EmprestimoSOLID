package src;

public class VerificadorAluno {
    public boolean verificarAluno(Aluno aluno) {
        if (aluno.getNome().equals("10")) {
            return false;
        } else {
            return true;
        }
    }
}