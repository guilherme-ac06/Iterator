package model;

public class SenhaAtendimento {

    private String codigo;
    private String nomePessoa;
    private String tipoAtendimento;

    public SenhaAtendimento(String codigo, String nomePessoa, String tipoAtendimento) {
        this.codigo = codigo;
        this.nomePessoa = nomePessoa;
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    @Override
    public String toString() {
        return codigo + " - " + nomePessoa + " - " + tipoAtendimento;
    }
}