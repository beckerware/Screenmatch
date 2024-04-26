package br.com.javaalura.screenmatch.modelos;

import br.com.javaalura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
    private String diretor;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.println("Nome do título: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        if(isIncluidoNoPlano()){
            System.out.println("Incluído no seu plano! Já pode asssistir.");
        }else{
            System.out.println("Ops! Este título não está incluído no seu plano. ");
        }

    }


    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override 
    public int getClassificacao(){
        return (int)pegaMedia() / 2;
    }

    
}
