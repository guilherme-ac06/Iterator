package service;

import java.util.List;

import model.SenhaAtendimento;

public class FilaAtendimentoIterator implements IteratorSenha {

    private List<SenhaAtendimento> senhas;
    private int posicao;

    public FilaAtendimentoIterator(List<SenhaAtendimento> senhas) {
        this.senhas = senhas;
        this.posicao = 0;
    }

    @Override
    public boolean hasNext() {

        return posicao < senhas.size();
    }

    @Override
    public SenhaAtendimento next() {

        SenhaAtendimento senha = senhas.get(posicao);

        posicao++;

        return senha;
    }
}