package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Saltburn", 2023);
        filme1.avalia(9);
        Filme filme2 = new Filme("Duna 2", 2024);
        filme2.avalia(9.5);
        Filme filme3 = new Filme("O Grande Hotel Budapeste", 2014);
        filme3.avalia(8.5);
        Serie serie = new Serie("House", 2004);

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(filme1);
        listaTitulos.add(filme2);
        listaTitulos.add(filme3);
        listaTitulos.add(serie);

        for (Titulo item : listaTitulos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao() + " estrelas.");
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Thimothée Chalamet");
        buscaPorArtista.add("Jacob Elordi");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Mads Mikkelsen");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenado: ");
        System.out.println(buscaPorArtista);
        
        System.out.println("Ordenando os títulos por nome: ");
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

        listaTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando os títulos por ano:");
        System.out.println(listaTitulos);
        

    }
}
