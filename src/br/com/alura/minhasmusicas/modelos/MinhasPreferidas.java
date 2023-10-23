package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.calculos.Classificavel;

public class MinhasPreferidas {
    public void incluir(Classificavel c, String t) {
        if (c.getClassificacao() >= 9) {
            System.out.println(t + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(t + " também é um dos que todo mundo está curtindo!");
        }
    }

    public void mostraDadosDoAudio(Audio audio) {
        audio.exibeFichaTecnica();
    }
}
