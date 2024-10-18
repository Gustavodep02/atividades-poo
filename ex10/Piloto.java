public class Piloto extends Pessoa{
    String licenca;
    int voos;
    String formacao;

    public Piloto(String nome, int idade, String documento, String licenca, int voos, String formacao) {
        super(nome, idade, documento);
        this.licenca = licenca;
        this.voos = voos;
        this.formacao = formacao;
    }

    public void pilotar() {
        System.out.println(nome + " está pilotando.");
    }
}
