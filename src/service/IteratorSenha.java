package service;

import model.SenhaAtendimento;

public interface IteratorSenha {

    boolean hasNext();

    SenhaAtendimento next();
}