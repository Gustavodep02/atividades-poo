public class Dinossauro{
    int energia = 5;
    int velocidade = 3;
    int temperatura = 36;
    String humor = "Neutro";

    void pular(){
        energia--;
        velocidade--;
        humor = "Feliz";
    }
    void correr(){
        energia--;
        humor = "Feliz";

    }
    void comer(){
        energia++;
        velocidade--;
        humor = "Feliz";
    }
    void cantar(){
        energia--;
        humor ="Feliz";
    }
    void tomarSol(){
        velocidade++;
        temperatura++;
        humor = "Feliz";
    }
    void ficarNaSombra(){
        energia++;
        humor = "Triste";
        temperatura--;
    }
}