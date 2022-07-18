package aula5;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;

    // #region encapsulamento [getters e setters]

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    // #endregion

    // #region regras de negocios

}
