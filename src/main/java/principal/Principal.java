package principal;

import cliente.Pessoa;
import endereco.Endereco;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Chaves", 12345678910L, 5);

        Endereco end1 = new Endereco("Av.João de Camargo", "Centro", 510);
        pessoa.addEndereco(end1);

        end1 = new Endereco("Guadalajara", "Centro", 54);
        pessoa.addEndereco(end1);

        pessoa.mostraInfo();
    }
}
