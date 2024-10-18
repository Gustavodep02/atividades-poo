public class Aeronave {
    String modelo;
    int capacidade;
    String identificacao;

    public Aeronave(String modelo, int capacidade, String identificacao) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.identificacao = identificacao;
    }

    public void decolar() {
        System.out.println("Aeronave " + identificacao + " decolou.");
    }

    public void pousar() {
        System.out.println("Aeronave " + identificacao + " pousou.");
    }
}
