package src;

public class Livro {
    private Titulo titulo;

    public Livro(int codigo) {
        // Cria uma instância de Titulo associada ao livro
        this.titulo = new Titulo(codigo);
    }

    // Obtém o prazo de devolução do livro
    public int obterPrazoDevolucao() {
        return titulo.getPrazo();
    }

    // Verifica se o livro é válido para empréstimo
    public boolean isValidoParaEmprestimo() {
        // Lógica para determinar se o livro é válido (por exemplo, com base no código)
        return (this.titulo.getCodigo() != 3);
    }
}
