package aula4;

public class programa {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "toyota";
        van.modelo = "hiace";
        van.capCmbustivel = 74;
        van.numPassageiro = 10;
        van.consCombustivel = 20.2;
        van.tipoCombustivel = "diesel";

        Carro fusca = new Carro();
        fusca.marca = "volkswagen";
        fusca.modelo = "fusca";
        fusca.capCmbustivel = 40;
        fusca.numPassageiro = 4;
        fusca.consCombustivel = 7.7;
        fusca.tipoCombustivel = "gasolina";

        System.out.println("----- Impressao do objeto [fisico]----");
        System.out.println("modelo: " + van.modelo + " | Autonomia: " + van.calculaAutonomia());
        System.out.println("eco taxa: " + van.verificarEcoDesempenho());
        if (van.validaEcoDesempenho(105) == true) {
            System.out.println("eco eficiente. ");
        } else {
            System.out.println("nao e eco eficiente.");
        }

        System.out.println("---------------------------------------------");

        System.out.println("modelo: " + fusca.modelo + " | autonomia: " + fusca.calculaAutonomia());
        System.out.println("eco taxa: " + fusca.verificarEcoDesempenho());
        if (fusca.validaEcoDesempenho(100) == true) {
            System.out.println("eco eficiente");
        } else {
            System.out.println("nao e eco eficiente");
        }

        System.out.println("---exercicio de aeronave");

        Aeronave boing = new Aeronave();
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

    }
}