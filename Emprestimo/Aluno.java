package src;

import java.util.List;

public class Aluno {
    private String RA;

    public Aluno(String nome) {
        this.RA = nome;
    }

    public String getNome() {
        return RA;
    }

    public void setNome(String nome) {
        this.RA = nome;
    }
}
