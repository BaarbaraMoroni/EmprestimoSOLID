package src;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    public boolean validarAluno(String aluno) {
        AlunoService alunoService = new AlunoService();
        return alunoService.verificarAluno(aluno);
    }

    public boolean verificarDebito(String aluno) {
        DebitoService debitoService = new DebitoService();
        return debitoService.verificarDebito(aluno);
    }

    public boolean emprestarLivros(String aluno, int[] codigos) {
        LivroService livroService = new LivroService();
        List<Livro> livros = livroService.obterLivros(codigos);

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro válido foi fornecido.");
            return false;
        }

        EmprestimoService emprestimoService = new EmprestimoService();
        return emprestimoService.emprestar(aluno, livros);
    }
}
