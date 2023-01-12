public class Curso {
    private int codigo;
    private String nome;
    private String professor;
    private String horario;
    private String escola;

    public Curso(int codigo, String nome, String professor, String horario, String escola) {
        this.codigo = codigo;
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
        this.escola = escola;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class TestaCurso {
    public static void main(String[] args) {
        Curso c1 = new Curso(123, "Java", "Pardal", "9h", "generation");
        Curso c2 = new Curso(591, "Sql", "Girafales", "9h", "generation");

        c1.visualizar();
        c2.visualizar();
    }
}