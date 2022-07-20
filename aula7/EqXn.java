package aula7;

import java.lang.Math;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

    public double calculaXn(double delta) {
        xn = -getB() - Math.sqrt(delta) / 2 * getA();
        return xn;
    }

    public double calculaXP(double delta) {
        xp = -getB() + Math.sqrt(delta) / 2 * getA();
        return xp;
    }

    // #region encapsulamento

    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
    // #endregion

}
