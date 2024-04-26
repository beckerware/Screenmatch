import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Saltburn");
        filme1.setAnoDeLancamento(2023);
        filme1.setDiretor("Emerald Fennell");
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(131);

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filme1.exibeFichaTecnica();

        filme1.avalia(0);
        filme1.avalia(10);
        filme1.avalia(8.5);
        filme1.avalia(7);
        filme1.avalia(5);
        filme1.avalia(9.9);
        filme1.avalia(8.3);

        System.out.println("Média de avaliações do filme: " + filme1.pegaMedia());
        filtro.filtra(filme1);
        System.out.println("--------------------------------------------------");


        Filme filme2 = new Filme();
        filme2.setNome("Duna 2");
        filme2.setAnoDeLancamento(2024);
        filme2.setDiretor("Denis Villeneuve");
        filme2.setIncluidoNoPlano(false);
        filme2.setDuracaoEmMinutos(165);

        filme2.exibeFichaTecnica();

        filme2.avalia(10);
        filme2.avalia(10);
        filme2.avalia(8.5);
        filme2.avalia(6);
        filme2.avalia(9.8);
        filme2.avalia(9.9);
        filme2.avalia(8.7);

        System.out.println("Média de avaliações do filme: " + filme2.pegaMedia());
        filtro.filtra(filme2);


        
        System.out.println("--------------------------------------------------");

        Serie serie = new Serie();

        serie.setNome("House");
        serie.setAnoDeLancamento(2004);
        serie.setAtiva(false);
        serie.setEpisodiosPorTemporada(24);
        serie.setTemporadas(8);
        serie.setIncluidoNoPlano(true);
        serie.setMinutosPorEpisodio(42);
        serie.exibeFichaTecnica();

        serie.avalia(3);
        serie.avalia(10);
        serie.avalia(10);
        serie.avalia(7.5);
        serie.avalia(9.3);
        serie.avalia(10);
        serie.avalia(10);

        System.out.println("Média de avaliação da série: " + serie.pegaMedia());

        System.out.println("--------------------------------------------------");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
        System.out.println("Tempo para maratonar os títulos: " + calculadora.getTempoTotal() + " minutos");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        

    }
}