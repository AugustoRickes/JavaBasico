package aula6;

public class app {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Triangulo t1 = new Triangulo();
        Trapezio tra1 = new Trapezio();

        System.out.println(q1.getNomeFigura());
        q1.setLado(12);
        System.out.println("Area: " + q1.getArea());
        System.out.println("perimetro: " + q1.getPerimetro());

        System.out.println("--------------------------------");

        System.out.println(t1.getNomeFigura());
        t1.setAltura(75);
        t1.setBase(30);
        t1.setLadoA(40);
        t1.setLadoB(40);
        t1.setLadoC(50);
        System.out.println("Area: " + t1.getArea());
        System.out.println("perimetro: " + t1.getPerimetro());

        System.out.println("------------------------------");

        System.out.println(tra1.getNomeFigura());
        tra1.setAltura(15);
        tra1.setBaseMaior(20);
        tra1.setBaseMenor(40);
        tra1.setAltura(40);
        tra1.setLadoA(50);
        tra1.setLadoB(10);
        System.out.println("Area: " + t1.getArea());
        System.out.println("perimetro: " + t1.getPerimetro());

    }

}
