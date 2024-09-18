package Aprendizado.Desafio.segundo;

public class Principal {
    public static void main(String[] args) throws Exception {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 8); // Exemplo com altura e largura
        calculadora.calcularPerimetro(5, 8);
    }
}
