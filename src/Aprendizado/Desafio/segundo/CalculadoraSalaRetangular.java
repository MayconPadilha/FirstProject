package Aprendizado.Desafio.segundo;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    

    public void calcularArea(double altura, double largura){
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area);
    }

    public void calcularPerimetro(double altura, double largura){
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é: " + perimetro);
    }

}
