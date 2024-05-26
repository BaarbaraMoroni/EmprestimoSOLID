package src;

import java.util.List;

public class GerenciadorEmprestimo {
    public boolean emprestarLivros(Aluno aluno, List<Livro> livros) {
        Emprestimo emprestimo = new Emprestimo();
        return emprestimo.emprestar(livros);
    }
}
