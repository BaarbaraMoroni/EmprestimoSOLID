package src;

public class Livro {
    private int codigo;
    private Titulo titulo;

    public Livro(int codigo) {
        this.codigo = codigo;
        this.titulo = TituloService.obterTitulo(codigo);
    }

    public int verPrazo() {
        return TituloService.obterPrazo(this.titulo);
    }

    public boolean verificaLivro() {
        return (this.codigo == 3);
    } 
}