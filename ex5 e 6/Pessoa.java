public class Pessoa{
    String nome;
    String endereco;
    double altura;
    double peso;
    int idade;

    public Pessoa(String nome, String endereco, double altura, double peso, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.altura = altura;
        this.peso = peso;
        this. idade = idade;
    }

    public void comer(){
        System.out.println(nome+ " esta comendo");
    }
    public void andar(){
        System.out.println(nome+" esta andando");
    }
    public void falar(){
        System.out.println(nome+ " esta falando");
    }
} 