package aula7;

import java.lang.Math;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

    public double calculaXn(Delta dt) {
        xn = (-dt.getB() - Math.sqrt(dt.getDelta())) / 2 * dt.getA();
        return xn;
    }

    public double calculaXP(Delta dt) {
        xp = (-dt.getB() + Math.sqrt(dt.getDelta())) / 2 * dt.getA();
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
