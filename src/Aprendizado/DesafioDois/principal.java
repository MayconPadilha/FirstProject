package Aprendizado.DesafioDois;

import Aprendizado.DesafioDois.model.MinhasPreferidas;
import Aprendizado.DesafioDois.model.Musica;
import Aprendizado.DesafioDois.model.PodCast;

public class principal {

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Smells Like Teen Spirit");
        minhaMusica.setArtista("Nirvana");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        PodCast meuPodCast = new PodCast();
        meuPodCast.setTitulo("BolhaDev");
        meuPodCast.setHost("Marcus Mnedes");

        for (int i = 0; i < 3000; i++) {
            meuPodCast.reproduz();
        }

        for (int i = 0; i < 800; i++) {
            meuPodCast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodCast);

        // System.out.println(minhaMusica.getArtista() + " - " + minhaMusica.getTitulo() + " - " + minhaMusica.getTotalCurtidas());
    }
    
}
