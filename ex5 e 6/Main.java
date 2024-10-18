public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Gustavo","Itaquera",1.80,75,22);
        p1.comer();
        p1.andar();
        p1.falar();

        Carro c1 = new Carro("PQ123","Macan",500000,"Preto",2023);
        c1.ligar();
        c1.acelerar();
        c1.desligar();

        Livro l1 = new Livro("IT a coisa", "Stephen King", "Terror",1104,"Suma");
        l1.ler();
        l1.procurar();
        l1.escrever();
    }

}