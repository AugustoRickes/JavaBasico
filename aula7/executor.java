package aula7;

import java.util.Scanner;

public class executor extends Equacao {
    public static void main(String[] args) {
        // Equacao e1 = new Equacao();
        Delta dt = new Delta();
        EqXn xnXp = new EqXn();

        Scanner entrada = new Scanner(System.in);
        System.out.println("qual o valor do A?");
        dt.setA(entrada.nextDouble());
        System.out.println("qual o valor do B?");
        dt.setB(entrada.nextDouble());
        System.out.println("qual o valor do C?");
        dt.setC(entrada.nextDouble());
        dt.calculaDelta();
        System.out.println("resultado de delta: " + dt.getDelta());
        if (dt.getDelta() < 0) {
            System.out.println("a equacao nao possui raizes reais.");
        } else {
            System.out.println("xn :" + xnXp.calculaXn(dt));
            System.out.println("xp :" + xnXp.calculaXP(dt));
        }

    }

}
