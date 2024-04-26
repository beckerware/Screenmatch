package br.com.javaalura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do título: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        if(ativa){
            System.out.println("Status: ativa");
        }else{
            System.out.println("Status: terminada");
        }
        System.out.println("Número de temporadas: " + temporadas);
        System.out.println("Minutos por episódio: " + minutosPorEpisodio);
        System.out.println("Tempo para maratonar a série: " + getDuracaoEmMinutos() + " minutos");
        if(isIncluidoNoPlano()){
            System.out.println("Incluído no seu plano! Já pode asssistir.");
        }else{
            System.out.println("Ops! Este título não está incluído no seu plano. ");
        }

    }

    public int getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return this.ativa;
    }

    public boolean getAtiva() {
        return this.ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return this.episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return this.minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


}
