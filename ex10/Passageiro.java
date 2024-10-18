public class Passageiro extends Pessoa{
    String assento;
    String classeVoo;
    int mala;

    public Passageiro(String nome, int idade, String documento, String assento, String classeVoo, int mala) {
        super(nome, idade, documento);
        this.assento = assento;
        this.classeVoo = classeVoo;
        this.mala = mala;
    }

    public void embarcar() {
        System.out.println(nome + " embarcou no voo.");
    }
}
