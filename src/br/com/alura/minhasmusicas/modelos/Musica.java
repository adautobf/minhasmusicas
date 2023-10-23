package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.calculos.Classificavel;

public class Musica extends Audio implements Classificavel {
    private String artista;
    private String album;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Artista: " + this.getArtista());
        System.out.println("Album: " + this.getAlbum());
        System.out.println("Genero: " + this.getGenero());
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
