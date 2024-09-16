package ScreenMatch.calculos;

import ScreenMatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){ //polimorfia
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
