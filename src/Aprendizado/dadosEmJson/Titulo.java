package Aprendizado.dadosEmJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class Titulo {
    // 2. Defina uma classe chamada Titulo com os atributos necessários. Em seguida,
    // crie um programa que instancia um objeto Titulo, serializa esse objeto para
    // JSON usando a biblioteca Gson e imprime o resultado.

    // 3. Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante. Utilize o método setPrettyPrinting para alcançar esse resultado.

    private String nome;
    private int anoDeLancamento;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public static void main(String[] args) {
        Titulo titulo = new Titulo("O Senhor dos Aneis", 1954);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}
