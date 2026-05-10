package service;

import java.util.ArrayList;
import java.util.List;

import model.SenhaAtendimento;

public class FilaAtendimento {

    private List<SenhaAtendimento> senhas;

    public FilaAtendimento() {
        senhas = new ArrayList<>();
    }

    public void adicionarSenha(SenhaAtendimento senha) {
        senhas.add(senha);
    }

    public IteratorSenha criarIterator() {
        return new FilaAtendimentoIterator(senhas);
    }
}