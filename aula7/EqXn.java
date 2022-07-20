package aula7;

import java.lang.Math;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

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

    // #region regra de negocio
    public double calculaXn(Delta dt) {
        xn = (-dt.getB() - Math.sqrt(dt.getDelta())) / 2 * dt.getA();
        return xn;
    }

    public double calculaXP(Delta dt) {
        xp = (-dt.getB() + Math.sqrt(dt.getDelta())) / 2 * dt.getA();
        return xp;
    }
    // #endregion
}
