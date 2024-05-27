public class Alunos {

    private static int contadorAlunos = 1;

    //Definição de atributos:
    private String nome;
    private int matricula;
    private String serie;
    private String periodo;

    //Construtor:
    public Alunos(String nome, String serie, String periodo) {
        this.nome = nome;
        this.matricula = contadorAlunos;
        this.serie = serie;
        this.periodo = periodo;
        contadorAlunos += 1;
    }

    //Getter e Setter:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }




}




