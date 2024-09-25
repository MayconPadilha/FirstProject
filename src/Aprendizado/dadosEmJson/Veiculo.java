package Aprendizado.dadosEmJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Veiculo {
    // 4. Defina uma classe chamada Veiculo com os atributos necessários. Em
    // seguida, crie um programa que instancia um objeto Veiculo, serializa esse
    // objeto para JSON usando a biblioteca Gson e imprime o resultado.

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;

    public Veiculo(String marca, String modelo, int anoFabricacao, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    public static void main(String[] args) {

        Veiculo carro = new Veiculo("Ford", "Fiesta", 2010, 10000.0);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonVeiculo = gson.toJson(carro);

        // Imprima o JSON resultante
        System.out.println("Objeto Veiculo serializado para JSON:");
        System.out.println(jsonVeiculo);
    }

}
