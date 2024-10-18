import java.util.Scanner;
import java.time.LocalDate;
public class GestaoAlunos {
    int indice;
    Aluno[] alunos = new Aluno[50];
    Scanner scan = new Scanner(System.in);
    public void criar(){
        System.out.println("Digite o id do aluno:");
        long id = scan.nextLong();

        System.out.println("Digite o ano de nascimento do aluno:");
        int ano = scan.nextInt();

        System.out.println("Digite o mês de nascimento do aluno:");
        int mes = scan.nextInt();

        System.out.println("Digite o dia de nascimento do aluno:");
        int dia = scan.nextInt();
    
        scan.nextLine(); 

        System.out.println("Digite o RA do aluno:");
        String ra = scan.nextLine();

        System.out.println("Digite o nome do aluno:");
        String nome = scan.nextLine();

        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        Aluno aluno = new Aluno(id, nascimento, ra, nome);
        alunos[indice] = aluno;
        indice++;
        System.out.println("Aluno criado com sucesso!");
    }
    public void atualizar(){
        System.out.println("Digite o RA do aluno a ser atualizado:");
    String ra = scan.nextLine();
    boolean encontrado = false;

    for (int i = 0; i < indice; i++) {
        if (alunos[i] != null && alunos[i].ra.equals(ra)) {
            System.out.println("Aluno encontrado. Atualize as informações:");

            System.out.println("Digite o novo nome:");
            alunos[i].nome = scan.nextLine();

            System.out.println("Digite o ano de nascimento do aluno:");
            int ano = scan.nextInt();

            System.out.println("Digite o mês de nascimento do aluno:");
            int mes = scan.nextInt();

            System.out.println("Digite o dia de nascimento do aluno:");
            int dia = scan.nextInt();
            
            scan.nextLine();

            LocalDate nascimento = LocalDate.of(ano, mes, dia);
            alunos[i].nascimento = nascimento;

            System.out.println("Aluno atualizado com sucesso!");
            encontrado = true;
            break;
        }
    }

        if (!encontrado) {
            System.out.println("Aluno com RA " + ra + " não encontrado.");
        }
    }
    public void excluir() {
        System.out.println("Digite o RA do aluno a ser excluído:");
        String ra = scan.nextLine();
        int cont = 0;

        while (cont < indice) {
            if (alunos[cont].ra.equals(ra)) { 
                alunos = removerAluno(alunos, cont); 
                indice--;
                System.out.println("Aluno removido com sucesso.");
                break;
            }
            cont++;
        }

       
    }
    public Aluno[] removerAluno(Aluno[] array, int indiceParaRemover) {
        Aluno[] novoArray = new Aluno[array.length - 1];

        for (int i = 0; i < indiceParaRemover; i++) {
            novoArray[i] = array[i];
        }

        for (int i = indiceParaRemover; i < novoArray.length; i++) {
            novoArray[i] = array[i + 1];
        }

        return novoArray;
    }

    public void exibir(){
        System.out.println("Digite o ra do aluno a ser exibido:");
        String ra = scan.nextLine();
        int cont = 0;
        while(cont <=indice){
            if(alunos[cont].ra.equals(ra)){
                System.out.println(alunos[cont].toString());
                break;
            }
            cont++;
        }
    }
    public void menu(){
        while (true) {
            System.out.println("(C)riar  (E)xibir  (R)emover  (A)tualizar  (S)air");
            String opcao = scan.nextLine().toUpperCase();
            char letra = opcao.charAt(0);

            switch (letra) {
                case 'C':
                    criar();
                    break;
                case 'E':
                    exibir();
                    break;
                case 'R':
                    excluir();
                    break;
                case 'A':
                    atualizar();
                    break;
                case 'S':
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void main(String[] args) {
        GestaoAlunos sistema = new GestaoAlunos();
        sistema.menu();
    }
}
