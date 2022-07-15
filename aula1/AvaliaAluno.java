package aula1;

public class AvaliaAluno {
    public static void main(String[] args) {
        String aluno = "Augusto";
        double nota1 = 8.66;
        double nota2 = 7.61;
        double nota3 = 9.1;
        double media = (nota1 + nota2 + nota3) / 3;
        double fator1 = 0.6;
        double fator2 = 0.2;
        boolean skl = false;

        /*
         * *se o aluno for estagiario soma das notas tem maior fator a n1 caso nao, o
         * maior fator sera o estagio n3.
         * para o aluno ser aprovado ele precisa somar 7 no total.
         */
        if (skl = false) {
            media = ((nota1 + (nota1 * fator1)) + nota2 + nota3) / 3;
            if (media >= 7) {
                System.out.println(aluno + " aprovado com media: " + media);
            } else {
                System.out.println(aluno + " reprovado com media: " + media);
            }
        } else {
            media = ((nota1 + (nota1 * fator2)) + nota2 + nota3) / 3;
            if (media >= 7) {
                System.out.println(aluno + " aprovado com media: " + media);
            } else {
                System.out.println(aluno + " reprovado com media: " + media);
            }
        }
    }
}
