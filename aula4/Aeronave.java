package aula4;

public class Aeronave {

    int tripulacao;
    String combustivel;
    double consumo;
    int passageiros;
    double passagem;
    double tanque;

    public double calcAutonomia() {
        return Math.round((this.tanque * this.consumo));
    }

    public double indicePassageiros() {
        double indPass = ((this.calcAutonomia() / (this.tripulacao + this.passageiros)) * this.isCombustivel());
        return Math.round(indPass);
    }

    public double mediaAutonomia() {
        double media = this.indicePassageiros() / this.passagem;
        return media;
    }

    public double isCombustivel() {
        double modificador = 0;
        if (this.combustivel == "QAV-1") {
            return modificador = 1.5;
        } else if (this.combustivel == "outro") {
            return modificador = 1.9;
        } else {
            return modificador = 1;
        }

    }
}

/*
 * Criar uma classe chamada Aeronave:
 * [tripulacao, combustivel, consumo, passageiros, passagem, tanque]
 * Criar os métodos da classe Aeronave:
 * 1. calcular a autonomia da Aeronave.
 * 2. calcular o indice por passageiro.
 * 3. Media de valor por autonomiia de voo.
 * Depois usar a classe programa para mostrar estes dados em
 * 4 objetos e seu local fisico de armazenamento.
 */