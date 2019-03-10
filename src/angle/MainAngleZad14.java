package angle;

import java.math.BigDecimal;

public class MainAngleZad14 {

    public static void main(String[] args) {


        // ------ Stałe z klasy Angle w radianach ------

        System.out.println(" ------------------------------ Stałe ----------");
        System.out.println("Kąt prosty: Angle.RIGHT_ANGLE = " + Angle.RIGHT_ANGLE);
        System.out.println("Kąt półpełny: Angle.STRAIGHT_ANGLE = " + Angle.STRAIGHT_ANGLE);
        System.out.println("Kąt pełny: Angle.FULL_ANGLE = " + Angle.FULL_ANGLE);
        System.out.println("1 Radian: Angle.RADIAN = " + Angle.RADIAN);
        System.out.println("1 Stopień: Angle.DEGREE = " + Angle.DEGREE);
        System.out.println("1 Minuta kątowa: Angle.ARC_MINUTE = " + Angle.ARC_MINUTE);
        System.out.println("1 Sekunda kątowa: Angle.ARC_SECOND = " + Angle.ARC_SECOND);
        System.out.println();


        System.out.println(" ------------------------------ Stałe użyte przez obiekt klasy Angle ----------");
        System.out.println("Kąt prosty: new Angle(Angle.RIGHT_ANGLE) -> " + new Angle(Angle.RIGHT_ANGLE));
        System.out.println("Kąt półpełny: new Angle (Angle.STRAIGHT_ANGLE) = " + new Angle (Angle.STRAIGHT_ANGLE));
        System.out.println("Kąt pełny: new Angle(Angle.FULL_ANGLE) = " + new Angle(Angle.FULL_ANGLE));
        System.out.println("1 Radian: new Angle (Angle.RADIAN)= " + new Angle (Angle.RADIAN));
        System.out.println("1 Stopień: new Angle (Angle.DEGREE) = " + new Angle (Angle.DEGREE));
        System.out.println("1 Minuta kątowa: new Angle (Angle.ARC_MINUTE) = " + new Angle (Angle.ARC_MINUTE));
        System.out.println("1 Sekunda kątowa: new Angle (Angle.ARC_SECOND) = " + new Angle (Angle.ARC_SECOND));
        System.out.println();

    }
}

