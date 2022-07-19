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
        fusca.tipoCombustivel = "etanol";

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
        System.out.println("-------- exercicio da aeronave-----------");

        Aeronave boeing737 = new Aeronave();
        boeing737.tripulacao = 4;
        boeing737.combustivel = " QAV-1";
        boeing737.consumo = 113;
        boeing737.passageiros = 132;
        boeing737.passagem = 980;
        boeing737.tanque = 26000;

        System.out.println(boeing737);

        System.out.println(" Autonomia: " + boeing737.calcAutonomia() + " Media autonomia: "
                + boeing737.mediaAutonomia() + " Indice Passageiro: " + boeing737.indicePassageiros());
    }

}