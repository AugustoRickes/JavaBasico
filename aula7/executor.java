package aula7;

import java.util.Scanner;

public class executor extends Equacao {
    public static void main(String[] args) {
        Equacao e1 = new Equacao();
        EqXn xnXp = new EqXn();

        Scanner entrada = new Scanner(System.in);
        System.out.println("qual o valor do A?");
        e1.setA(entrada.nextDouble());
        System.out.println("qual o valor do B?");
        e1.setB(entrada.nextDouble());
        System.out.println("qual o valor do C?");
        e1.setC(entrada.nextDouble());

    }

}
