import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SistemaMatriculas {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Alunos> arrayAlunos;
    static ArrayList<Alunos> arrayAlunosExcluidos;

    public static void main(String[] args) {
        arrayAlunos = new ArrayList<>();
        arrayAlunosExcluidos = new ArrayList<>();
        operacoes();
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

    public static void cadastrarAluno() {

        System.out.println("\nNome: ");
        String nome = input.next();
        System.out.println("\nSérie: ");
        String serie = input.next();
        System.out.println("\nPeríodo: ");
        String periodo = input.next();
        Alunos aluno = new Alunos(nome, serie, periodo);
        if (!arrayAlunosExcluidos.isEmpty()) {
            aluno.setMatricula(orderAlunos(arrayAlunosExcluidos));
        }
        arrayAlunos.add(aluno);
        System.out.println("\nAluno cadastrado com sucesso.");
        operacoes();
    }

    public static void excluirAluno() {

        System.out.println("\nDigite a matrícula do aluno que deseja excluir: ");
        int matricula = input.nextInt();
        Alunos aluno = buscarAluno(matricula);
        if (aluno != null) {
            arrayAlunosExcluidos.add(aluno);
            arrayAlunos.remove(aluno);
            System.out.println("\nAluno excluído com sucesso.");
        }
        operacoes();
    }

    public static Alunos buscarAluno(int matricula) {
        Alunos aluno = null;
        if (!arrayAlunos.isEmpty()) {
            for (Alunos a : arrayAlunos) {
                if (a.getMatricula() == matricula) {
                    aluno = a;
                }else{
                    System.out.println("\nAluno não encontrado.");
                }
            }
        } else {
            System.out.println("\nNão há alunos cadastrados.");
        }
        return aluno;
    }

    public static void atualizarMatricula() {
        System.out.println("\nDigite a matrícula do aluno que deseja atualizar: ");
        int matricula = input.nextInt();
        Alunos aluno = buscarAluno(matricula);
        if (aluno != null) {
            System.out.println("\nDigite o novo nome: ");
            String nome = input.next();
            System.out.println("\nDigite a nova série: ");
            String serie = input.next();
            System.out.println("\nDigite o novo período: ");
            String periodo = input.next();
            aluno.setNome(nome);
            aluno.setSerie(serie);
            aluno.setPeriodo(periodo);
            System.out.println("\nAluno atualizado com sucesso.");
            operacoes();
        }
    }

    public static void listarAlunos() {
        if (!arrayAlunos.isEmpty()) {
            for (Alunos a : arrayAlunos) {
                System.out.println(a);
            }

        }else{
            System.out.println("\nNão há alunos cadastrados.");
        }
        operacoes();
    }

    public static int orderAlunos(ArrayList<Alunos> arrayAlunos) {
        int matricula = 0;
        ArrayList<Integer> matriculas = new ArrayList<Integer>();
        for (Alunos a : arrayAlunos) {
            matriculas.add(a.getMatricula());
        }
        matricula = matriculas.getFirst();
        matriculas.removeFirst();
        return matricula;
    }


}
