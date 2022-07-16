package aula4;

import java.lang.Math;

public class Carro {
    // #region Atributos
    String marca;
    String modelo;

    int numPassageiro;
    double capCmbustivel;
    double consCombustivel;
    String tipoCombustivel;

    // #endregion
    // #region Regras de negocio da classe (metodos)
    public double calculaAutonomia() {
        return Math.round((this.capCmbustivel * this.consCombustivel));
    }

    public double avaliaTipoDeCombustivel(String combustivel) {
        if (combustivel == "diesel") {
            return 1.6;
        } else if (combustivel == "gasolina") {
            return 1;
        } else {
            return 0.7;
        }
    }

    public double verificarEcoDesempenho() {
        double eco = (this.calculaAutonomia() / this.numPassageiro)
                * this.avaliaTipoDeCombustivel(this.tipoCombustivel);
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
