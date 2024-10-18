import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class GestaoFuncionarios {
    int indice = 0;
    Funcionario[] funcionarios = new Funcionario[50];
    Scanner scan = new Scanner(System.in);
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void criar() {
        System.out.println("Digite o ID do funcionário:");
        long id = scan.nextLong();
        scan.nextLine();

        System.out.println("Digite o nome do funcionário:");
        String nome = scan.nextLine();

        System.out.println("Digite a matrícula do funcionário:");
        String matricula = scan.nextLine();

        LocalDate admissao = null;
        while (admissao == null) {
            System.out.println("Digite a data de admissão (dd/MM/yyyy):");
            String admissaoInput = scan.nextLine();
            try {
                admissao = LocalDate.parse(admissaoInput, dateFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }

        LocalDate demissao = null;
        System.out.println("Digite a data de demissão (dd/MM/yyyy) ou deixe em branco se ainda não foi demitido:");
        String demissaoInput = scan.nextLine();
        if (!demissaoInput.isEmpty()) {
            try {
                demissao = LocalDate.parse(demissaoInput, dateFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Não será registrada uma data de demissão.");
            }
        }

        System.out.println("Digite o salário do funcionário:");
        float salario = scan.nextFloat();
        scan.nextLine(); 

        System.out.println("Digite o horário do funcionário:");
        String horario = scan.nextLine();

        Funcionario funcionario = new Funcionario(id, nome, matricula, admissao, demissao, salario, horario);
        funcionarios[indice] = funcionario;
        indice++;

        System.out.println("Funcionário criado com sucesso!");
    }

    public void atualizar() {
        System.out.println("Digite a matrícula do funcionário a ser atualizado:");
        String matricula = scan.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < indice; i++) {
            if (funcionarios[i] != null && funcionarios[i].matricula.equals(matricula)) {
                System.out.println("Funcionário encontrado. Atualize as informações:");

                System.out.println("Digite o novo nome:");
                funcionarios[i].nome = scan.nextLine();

                LocalDate admissao = null;
                while (admissao == null) {
                    System.out.println("Digite a nova data de admissão (dd/MM/yyyy):");
                    String admissaoInput = scan.nextLine();
                    try {
                        admissao = LocalDate.parse(admissaoInput, dateFormatter);
                    } catch (DateTimeParseException e) {
                        System.out.println("Data inválida. Tente novamente.");
                    }
                }
                funcionarios[i].admissao = admissao;

                LocalDate demissao = null;
                System.out.println("Digite a nova data de demissão (dd/MM/yyyy) ou deixe em branco se ainda não foi demitido:");
                String demissaoInput = scan.nextLine();
                if (!demissaoInput.isEmpty()) {
                    try {
                        demissao = LocalDate.parse(demissaoInput, dateFormatter);
                    } catch (DateTimeParseException e) {
                        System.out.println("Data inválida. Não será registrada uma data de demissão.");
                    }
                }
                funcionarios[i].demissao = demissao;

                System.out.println("Digite o novo salário:");
                funcionarios[i].salario = scan.nextFloat();
                scan.nextLine();

                System.out.println("Digite o novo horário:");
                funcionarios[i].horario = scan.nextLine();

                System.out.println("Funcionário atualizado com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário com matrícula " + matricula + " não encontrado.");
        }
    }

    public void excluir() {
        System.out.println("Digite a matrícula do funcionário a ser excluído:");
        String matricula = scan.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < indice; i++) {
            if (funcionarios[i] != null && funcionarios[i].matricula.equals(matricula)) {
                funcionarios[i] = null;
                System.out.println("Funcionário excluído com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário com matrícula " + matricula + " não encontrado.");
        }
    }

    public void exibir() {
        System.out.println("Digite a matrícula do funcionário a ser exibido:");
        String matricula = scan.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < indice; i++) {
            if (funcionarios[i] != null && funcionarios[i].matricula.equals(matricula)) {
                funcionarios[i].exibir();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário com matrícula " + matricula + " não encontrado.");
        }
    }

    public void menu() {
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
        GestaoFuncionarios sistema = new GestaoFuncionarios();
        sistema.menu();
    }
}