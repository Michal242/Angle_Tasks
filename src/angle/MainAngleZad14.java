package angle;

import java.math.BigDecimal;

public class MainAngleZad14 {

    public static void main(String[] args) {


        // ------ Sta³e z klasy Angle w radianach ------

        System.out.println(" ------------------------------ Sta³e ----------");
        System.out.println("K¹t prosty: Angle.RIGHT_ANGLE = " + Angle.RIGHT_ANGLE);
        System.out.println("K¹t pó³pe³ny: Angle.STRAIGHT_ANGLE = " + Angle.STRAIGHT_ANGLE);
        System.out.println("K¹t pe³ny: Angle.FULL_ANGLE = " + Angle.FULL_ANGLE);
        System.out.println("1 Radian: Angle.RADIAN = " + Angle.RADIAN);
        System.out.println("1 Stopieñ: Angle.DEGREE = " + Angle.DEGREE);
        System.out.println("1 Minuta k¹towa: Angle.ARC_MINUTE = " + Angle.ARC_MINUTE);
        System.out.println("1 Sekunda k¹towa: Angle.ARC_SECOND = " + Angle.ARC_SECOND);
        System.out.println();


        System.out.println(" ------------------------------ Sta³e u¿yte przez obiekt klasy Angle ----------");
        System.out.println("K¹t prosty: new Angle(Angle.RIGHT_ANGLE) -> " + new Angle(Angle.RIGHT_ANGLE));
        System.out.println("K¹t pó³pe³ny: new Angle (Angle.STRAIGHT_ANGLE) = " + new Angle (Angle.STRAIGHT_ANGLE));
        System.out.println("K¹t pe³ny: new Angle(Angle.FULL_ANGLE) = " + new Angle(Angle.FULL_ANGLE));
        System.out.println("1 Radian: new Angle (Angle.RADIAN)= " + new Angle (Angle.RADIAN));
        System.out.println("1 Stopieñ: new Angle (Angle.DEGREE) = " + new Angle (Angle.DEGREE));
        System.out.println("1 Minuta k¹towa: new Angle (Angle.ARC_MINUTE) = " + new Angle (Angle.ARC_MINUTE));
        System.out.println("1 Sekunda k¹towa: new Angle (Angle.ARC_SECOND) = " + new Angle (Angle.ARC_SECOND));
        System.out.println();

    }
}

