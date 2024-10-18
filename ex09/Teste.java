public class Teste {
    public static void main(String[] args) {
        Processador processador = new Processador("AMD");
        Mouse mouse = new Mouse("Logitech");
        Computador computador = new Computador("Dell", processador, mouse);
        computador.testar();
    }
}
