package aula5;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    // #region Encapsulamento [getters e setters]

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    // #endregion

    // #region regras de negocios
    private double calculaMedia() {
        double media = 0;
        for (int i = 0; i < this.notas.length; i++) {
            media += notas[i];
        }
        return (media / notas.length);
    }

    private boolean verificaAprovacao(double media) {
        if (media >= 7) {
            return true;
        } else {
            return false;
        }

    }

    public String montaBoletim() {
        String boletim = "nome do aluno: " + super.getNome() + System.lineSeparator();
        if (this.verificaAprovacao(this.calculaMedia()) == false) {
            boletim += (System.lineSeparator() + "Devido a politica da academia, o resultado esta disponivel online");
        } else {
            boletim += ("CPF: " + super.getCpf() + System.lineSeparator() + System.lineSeparator());
            for (int i = 0; i < this.notas.length; i++) {
                boletim += (" avaliacao: " + this.notas[i] + " | " + System.lineSeparator());
            }
            boletim += ("resultado: Aprovado. " + System.lineSeparator());
            boletim += ("media final: " + this.calculaMedia() + System.lineSeparator());
        }
        return boletim;
    }
    // #endregion
}
