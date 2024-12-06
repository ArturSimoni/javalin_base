package br.edu.ifpr.pgua.eic.tads.models;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Pessoa> pessoas;

    public Cadastro() {
        this.pessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
