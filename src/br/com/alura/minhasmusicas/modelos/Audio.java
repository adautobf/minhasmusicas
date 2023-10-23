package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalCurtidas;
    private int totalReproducoes;
    private int duracaoEmMinutos;

    //getter and setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

//    public int getClassificacao() {
//        return 0;
//    }

    //methods
    public void curtir() {
        //System.out.println("Joinha!");
        this.totalCurtidas++;
    }

    public void reproduzir() {
        //System.out.println("Reproduzindo!");
        this.totalReproducoes++;
    }

    public void exibeFichaTecnica() {
        System.out.println("\nNome do Título: " + this.titulo);
        System.out.println("Duração em minutos: " + this.duracaoEmMinutos);
    }
}
