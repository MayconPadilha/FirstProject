package ScreenMatch;

import java.util.ArrayList;
import ScreenMatch.calculos.CalculadoraDeTempo;
import ScreenMatch.calculos.FiltroRecomendacao;
import ScreenMatch.model.Episodio;
import ScreenMatch.model.Filme;
import ScreenMatch.model.Serie;

public class Principal {
    public static void main(String[] args) throws Exception {
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        // System.out.println("Tempo total: " + calculadora.getTempoTotal());

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(favorito);
        filtro.filtrar(outro);
        filtro.filtrar(primeiro);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(favorito);
        filmes.add(outro);

        filmes.size();

        System.out.println("tamanho da lista: " + filmes.size());

        System.out.println("Filme:  " + filmes.get(0).getNome());
        System.out.println("Filme:  " + filmes.get(1).getNome());
        // System.out.println("Filme: " + filmes.get(2).getNome());
    }
}
