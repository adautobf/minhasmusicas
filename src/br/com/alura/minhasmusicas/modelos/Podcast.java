package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.calculos.Classificavel;

public class Podcast extends Audio implements Classificavel {
    private String entrevistador;
    private String convidado;
    private String descricao;

    public String getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(String entrevistador) {
        this.entrevistador = entrevistador;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Host: " + this.getEntrevistador());
        System.out.println("Convidado: " + this.getConvidado());
        System.out.println("Descrição: " + this.getDescricao());
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
