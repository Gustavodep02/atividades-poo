public class Livro{
    String titulo;
    String autor;
    String genero;
    int numeroPaginas;
    String editora;

     public Livro(String titulo, String autor, String genero, int numeroPaginas, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
     }

    public void ler(){
        System.out.println(titulo+ " esta sendo lido");
    }
    public void procurar(){
        System.out.println(titulo+" esta sendo procurado");
    }
    public void escrever(){
        System.out.println(titulo+ "esta sendo escrito");
    }
}