package aula5;

import java.lang.Math;

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

    private double calculaSalario() {
        return Math.round((this.salario * 44)) * 4.5;
    }

    private double calculaIrpf(){
        if()
    }

    public String montaHolerite() {
        String holerite;
        holerite = ("nome do professor: " + super.getNome() + System.lineSeparator());
        holerite += (" | CPF:" + super.getCpf() + System.lineSeparator());
        holerite += (" | valor salario: " + this.calculaSalario() + System.lineSeparator());
        holerite += (" | valor hora: " + this.getSalario() + System.lineSeparator());
        holerite += (" | valor referente: " + this.getNomeCurso() + System.lineSeparator());
        return holerite;
    }
}

/*
 * Montar o método que calcula o INSS.
 * https://www.jornalcontabil.com.br/como-calcular-o-desconto-do-inss-nos-
 * salarios-em-2022/#:~:text=At%C3%A9%20R%24%201.100%2C00%20(,e%206.433%2C57%20%
 * E2%80%93%2014%25
 * Montar o método que calcula o IRPF com aliquotas a seguir:
 * https://www.gov.br/receitafederal/pt-br/assuntos/orientacao-tributaria/
 * tributos/irpf-imposto-de-renda-pessoa-fisica
 * Montar o método de adição de planejamento de aula: 0,3 e DSR 0,2.
 */
