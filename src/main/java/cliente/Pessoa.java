package cliente;


import endereco.Endereco;

public class Pessoa {

    public String nome;
    public long cpf;            //int nao suporta 11 digitos então usei long
    public Endereco[] end;

    public Pessoa(String nome, long cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco endereco){
        for (int i = 0; i < end.length; i++) {
            if(end[i] == null){
                end[i] = endereco;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        int j;
        for (int i = 0; i < end.length; i++) {
            if(end[i] != null){
                j = i+1;
                System.out.println(" ");
                System.out.println("Endereço " + j + ": ");
                System.out.println("Rua: " + end[i].rua);
                System.out.println("N°: " + end[i].num);
                System.out.println("Bairro: " + end[i].bairro);
            }
        }
    }
}
