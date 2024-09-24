package Aprendizado.record;

import com.google.gson.Gson;

public class ConversaoJsonParaObjeto {

    // 1. Crie uma classe Pessoa usando o conceito de Record em Java, com atributos
    // como nome, idade e cidade. Em seguida, implemente um programa que utiliza a
    // biblioteca Gson para converter um JSON representando uma pessoa em um objeto
    // do tipo Pessoa.

    record PessoaRecord(String nome, int idade, String cidade) {}

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        PessoaRecord pessoa = gson.fromJson(jsonPessoa, PessoaRecord.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }

}
