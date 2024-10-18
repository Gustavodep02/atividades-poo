public class Aeroporto {
    String nome;
    String local;
    int capacidadeAeronaves;

    public Aeroporto(String nome, String local, int capacidadeAeronaves) {
        this.nome = nome;
        this.local = local;
        this.capacidadeAeronaves = capacidadeAeronaves;
    }

    public void adicionarAeronave(Aeronave aeronave) {
        System.out.println("Aeronave " + aeronave.identificacao + " adicionada ao aeroporto " + nome);
    }
}
