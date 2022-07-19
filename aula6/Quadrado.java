package aula6;

public class Quadrado implements FormaGeometrica {

    private int lado;

    // #region encapsulamento
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    // #endregion

    // #region regra de negocio
    @Override
    public int getArea() {
        int area = 0;
        area = lado * lado;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro = 0;
        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public String getNomeFigura() {
        return "quadrado";

    }

    // #endregion

}
