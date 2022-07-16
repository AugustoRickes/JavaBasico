package aula4;

import java.lang.Math;

public class Carro {
    // #region Atributos
    String marca;
    String modelo;
    String tipoCombustivel;

    int numPassageiro;
    double capCmbustivel;
    double consCombustivel;

    // #endregion
    // #region Regras de negocio da classe (metodos)
    public double calculaAutonomia() {
        return Math.round((this.capCmbustivel * this.consCombustivel));
    }

    public double verificarEcoDesempenho() {
        double eco = this.calculaAutonomia() / this.numPassageiro;
        return Math.round(eco);
    }

    public boolean validaEcoDesempenho(double indice) {
        if (this.verificarEcoDesempenho() > indice) {
            return true;
        } else {
            return false;
        }
    }

    // #endregion
}
