package Aprendizado.DesafioDois.model;

public class MinhasPreferidas {
    
    public void inclui(Audio audio) {
        if(audio.getClassficacao() >= 9) {
            System.out.println(audio.getTitulo() + "é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + "uma excelente opção!");
        }
    }
}
