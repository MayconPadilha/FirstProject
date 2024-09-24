package Aprendizado.record;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjetoFlexivel {

    // 2. Modifique o programa do Exercício anterior para permitir a conversão de um
    // JSON mesmo se alguns campos estiverem ausentes ou se houver campos adicionais
    // não representados no objeto Pessoa. Consulte a documentação da biblioteca
    // Gson para flexibilizar a conversão.

    record PessoaRecord(String nome, int idade, String cidade) {}

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        PessoaRecord pessoa = gson.fromJson(jsonPessoa, PessoaRecord.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }

}
