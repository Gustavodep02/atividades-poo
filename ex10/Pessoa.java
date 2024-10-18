public class Pessoa {
    String nome;
    int idade;
    String documento;

    public Pessoa(String nome, int idade, String documento) {
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }
}
