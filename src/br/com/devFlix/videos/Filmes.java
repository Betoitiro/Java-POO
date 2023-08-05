package br.com.devFlix.videos;

public class Filmes {
    String nome;
    String genero;
    int visualizacoes;
    double avaliacao;


    void Sobre(){
        System.out.printf("O fime %s, pertence ao genero de: %s, possui %s vizualizações e uma nota de %s!", nome, genero, visualizacoes,
        avaliacao);
    }
}
