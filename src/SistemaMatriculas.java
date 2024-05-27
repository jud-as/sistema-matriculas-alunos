public class SistemaMatriculas {

    public static void main(String[] args) {

    }

    public static void operacoes() {

        System.out.println("----------------------------------");
        System.out.println("------SELECIONE UMA OPERAÇÃO------\n");
        System.out.println("|    1 - Cadastrar Aluno       |");
        System.out.println("|    2 - Excluir Matrícula     |");
        System.out.println("|    3 - Atualizar Matrícula   |");
        System.out.println("|    4 - Listar Alunos         |");
        System.out.println("|    5 - Sair                  |");

        int opc = input.nextInt();
        switch(opc) {
            case 1:
                cadastrarAluno();
                break;
            case 2:
                excluirAluno();
                break;
            case 3:
                atualizarMatricula();
                break;
            case 4:
                listarAlunos();
                break;
            case 5:
                System.out.println("Encerrando programa.");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida.");
                operacoes();
                break;
        }
    }
}
