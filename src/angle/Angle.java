package angle;

public class Angle {

    private double x;

    public Angle() {
    }

    public Angle(double x) {
        this.x = x;
    }

    public double getAngle() {
        return x;
    }

    public double getAngleSinus() {
        return Math.sin(x);
    }

    public double getAngleCosiunus() {
        return Math.cos(x);
    }

    public double getAngleTangens() {
        return Math.tan(x);
    }

    public double getAngleCotangens() {
        return 1.0 / Math.tan(x);
    }

    public double getAngleSecans() {
        return 1.0 / Math.sin(x);
    }

    public double getAngleCosecans() {

        return 1.0 / Math.cos(x);
    }

    public double radian() {
        return x;
    }

    public double degree() {
        return Math.toDegrees(x);

    }




}
