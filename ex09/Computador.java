public class Computador {
    String marca;
    Processador processador;
    Mouse mouse;

    public Computador() {
        this.marca = "HP";
        this.processador = new Processador();
        this.mouse = new Mouse();
    }

    public Computador(String marca, Processador processador, Mouse mouse) {
        this.marca = marca;
        this.processador = processador;
        this.mouse = mouse;
    }

    public void testar(){
        System.out.println(marca+" com processador "+processador+" e mouse "+mouse);
    }
}
