public class Carro{
    String placa;
    String modelo;
    double valor;
    String cor;
    int ano;

    public Carro(String placa, String modelo, double valor, String cor, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.valor = valor;
        this.cor = cor;
        this.ano = ano;
    }

    public void ligar(){
        System.out.println(modelo+" esta ligando");
    }
    public void acelerar(){
        System.out.println(modelo+" esta acelerando");
    }
    public void desligar(){
        System.out.println(modelo+" esta desligando");
    }
}