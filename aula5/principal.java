package aula5;

public class principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Aluno a2 = new Aluno();

        p1.setNome("reginaldo");
        p1.setEndereco("rua das flores,220");
        p1.setTelefone("(99)999.999.999");
        p1.setCpf("123.456.789-10");
        p1.setNomeCurso("Java Spring Web");
        p1.setSalario(24.20);

        a1.setNome("murilo");
        a1.setEndereco("rua alfeneiros,4");
        a1.setTelefone("(12)111.222.333");
        a1.setCpf("147.852.369-32");
        a1.setCurso("Java Spring Web");
        double[] notas = { 9.5, 6.5, 8.5, 6.3, 9.7, 8.6 };
        a1.setNotas(notas);

        a2.setNome("Helena Carlos");
        a2.setEndereco("Rua das Pinheiras, 4");
        a2.setTelefone("(16)99823.5623");
        a2.setCpf("302.552.456-56");
        a2.setCurso("Ciencia de Dados");
        double[] notas2 = { 7.5, 6.5, 2.5, 6.3, 8.7, 6.6 };
        a2.setNotas(notas2);
        a2.setEstagio(true);

        System.out.println(p1.montaHolerite());
        System.out.println(a1.montaBoletim());
        System.out.println(a2.montaBoletim(a2.getEstagio()));

    }
}
