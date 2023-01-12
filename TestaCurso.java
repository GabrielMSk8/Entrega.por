import java.util.Scanner;

public class TestaCurso {
    public static void main(String[] args) {
        Curso c1 = new Curso(123, "Java", "Pardal", "9h", "generation");
        Curso c2 = new Curso(591, "Sql", "Girafales", "9h", "generation");

        c1.visualizar();
        c2.visualizar();
    }
}