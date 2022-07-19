package aula6;

public class Trapezio implements FormaGeometrica {
    private int baseMaior;
    private int baseMenor;
    private int altura;
    private int ladoA;
    private int ladoB;

    // #region encapsulamento
    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    // #endregion

    // #region regras de negocio

    @Override
    public String getNomeFigura() {
        return "Trapezio";
    }

    @Override
    public int getArea() {
        int area = 0;
        area = ((baseMaior + baseMenor) * altura) / 2;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro = 0;
        perimetro = baseMaior + baseMenor + ladoA + ladoB;

        return perimetro;
    }

}
