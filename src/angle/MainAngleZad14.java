package angle;

import java.math.BigDecimal;

public class MainAngleZad14 {

    public static void main(String[] args) {


        // ------ Sta�e z klasy Angle w radianach ------

        System.out.println(" ------------------------------ Sta�e ----------");
        System.out.println("K�t prosty: Angle.RIGHT_ANGLE = " + Angle.RIGHT_ANGLE);
        System.out.println("K�t p�pe�ny: Angle.STRAIGHT_ANGLE = " + Angle.STRAIGHT_ANGLE);
        System.out.println("K�t pe�ny: Angle.FULL_ANGLE = " + Angle.FULL_ANGLE);
        System.out.println("1 Radian: Angle.RADIAN = " + Angle.RADIAN);
        System.out.println("1 Stopie�: Angle.DEGREE = " + Angle.DEGREE);
        System.out.println("1 Minuta k�towa: Angle.ARC_MINUTE = " + Angle.ARC_MINUTE);
        System.out.println("1 Sekunda k�towa: Angle.ARC_SECOND = " + Angle.ARC_SECOND);
        System.out.println();


        System.out.println(" ------------------------------ Sta�e u�yte przez obiekt klasy Angle ----------");
        System.out.println("K�t prosty: new Angle(Angle.RIGHT_ANGLE) -> " + new Angle(Angle.RIGHT_ANGLE));
        System.out.println("K�t p�pe�ny: new Angle (Angle.STRAIGHT_ANGLE) = " + new Angle (Angle.STRAIGHT_ANGLE));
        System.out.println("K�t pe�ny: new Angle(Angle.FULL_ANGLE) = " + new Angle(Angle.FULL_ANGLE));
        System.out.println("1 Radian: new Angle (Angle.RADIAN)= " + new Angle (Angle.RADIAN));
        System.out.println("1 Stopie�: new Angle (Angle.DEGREE) = " + new Angle (Angle.DEGREE));
        System.out.println("1 Minuta k�towa: new Angle (Angle.ARC_MINUTE) = " + new Angle (Angle.ARC_MINUTE));
        System.out.println("1 Sekunda k�towa: new Angle (Angle.ARC_SECOND) = " + new Angle (Angle.ARC_SECOND));
        System.out.println();

    }
}

