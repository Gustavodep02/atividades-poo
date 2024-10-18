public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto("Carlos", 45, "123456", "PL123", 5000, "PCM");
        Piloto piloto2 = new Piloto("Ana", 38, "654321", "PL987", 3000, "PCM");

        Passageiro passageiro1 = new Passageiro("Maria", 30, "789123", "12A", "Econômica",2);
        Passageiro passageiro2 = new Passageiro("João", 25, "321987", "14B", "Executiva",1);

        Aeronave aeronave1 = new Aeronave("Boeing 737", 180, "BR737");
        Aeronave aeronave2 = new Aeronave("Airbus A320", 150, "AB320");

        Aeroporto aeroporto = new Aeroporto("Aeroporto Internacional", "São Paulo", 50);

        aeroporto.adicionarAeronave(aeronave1);
        aeroporto.adicionarAeronave(aeronave2);

        piloto1.pilotar();
        piloto2.falar();
        passageiro1.embarcar();
        passageiro2.andar();
        aeronave1.decolar();
    }
}
