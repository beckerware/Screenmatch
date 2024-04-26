package br.com.javaalura.screenmatch.modelos;

import br.com.javaalura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalViews;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return this.serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return this.totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }


    //regra de negócio fictícia, apenas para deixar claro diferenças entre métodos
    //que herdam da mesma interface
    @Override
    public int getClassificacao() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }

}
