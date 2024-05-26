package src;

import java.util.Date;
import java.util.List;

public class Emprestimo {
    private Date dataEmprestimo;
    private Date dataPrevista;
    private List<Item> itensEmprestados;
    private CalculadoraDataDevolucao calculadoraDataDevolucao;

    public Emprestimo(CalculadoraDataDevolucao calculadoraDataDevolucao) {
        this.calculadoraDataDevolucao = calculadoraDataDevolucao;
    }

    public boolean emprestar(List<Livro> livros) {
        this.dataEmprestimo = new Date();
        this.dataPrevista = calculadoraDataDevolucao.calcularDataDevolucao(livros);
        this.itensEmprestados = criarItensEmprestados(livros);

        System.out.println("\nNumero de Livros Emprestados: " + livros.size());
        System.out.println("Data de Empréstimo: " + this.dataEmprestimo);
        System.out.println("Data de Devolução: " + this.dataPrevista);

        return true;
    }

    private List<Item> criarItensEmprestados(List<Livro> livros) {
        List<Item> itens = new ArrayList<>();
        for (Livro livro : livros) {
            itens.add(new Item(livro));
        }
        return itens;
    }
}
