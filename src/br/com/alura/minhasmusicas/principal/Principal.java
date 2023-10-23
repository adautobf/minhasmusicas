package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Dogs");
        minhaMusica.setArtista("Pink Floyd");
        minhaMusica.setAlbum("Animals");
        minhaMusica.setGenero("Rock Progressivo");
        minhaMusica.setDuracaoEmMinutos(18);

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Inteligência LTDA");
        meuPodcast.setConvidado("Daniel Veiga");
        meuPodcast.setEntrevistador("Rogério Vilela");
        meuPodcast.setDescricao("Inteligência pelo Mundo - Viagem pra Polônia");
        meuPodcast.setDuracaoEmMinutos(67);

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(meuPodcast, meuPodcast.getTitulo());
        preferidas.incluir(minhaMusica, minhaMusica.getTitulo());

        preferidas.mostraDadosDoAudio(meuPodcast);
        preferidas.mostraDadosDoAudio(minhaMusica);
    }
}
