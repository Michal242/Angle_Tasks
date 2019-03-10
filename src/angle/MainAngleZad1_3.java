package angle;

public class MainAngleZad1_3 {

    public static void main(String[] args) {

        Angle angle = new Angle(90);
        Angle angle2 = new Angle(180,15,1);

        double angleValueRad = angle.getAngle();
        System.out.println("Kąt w radianach: " + angle.radian());
        System.out.println("Kąt w stopniach: " + angle.degree());
        System.out.println("\nWartości wybranych funkcji trygonometrycznych.\n");
        System.out.printf("Sinus(%.2f) = %.4f\n", angleValueRad, angle.getAngleSinus());
        System.out.printf("Cosinus(%.2f) = %.4f\n", angleValueRad, angle.getAngleCosiunus());
        System.out.printf("Tangens(%.2f) = %.4f\n", angleValueRad, angle.getAngleTangens());
        System.out.printf("Cotangens(%.2f) = %.4f\n", angleValueRad, angle.getAngleCotangens());
        System.out.printf("Secans(%.2f) = %.4f\n", angleValueRad, angle.getAngleSecans());
        System.out.printf("Cosecans(%.2f) = %.4f\n", angleValueRad, angle.getAngleCosecans());

        System.out.println(angle);

        System.out.println("Kąt w radianach: " + angle2.radian());
        System.out.println("Kąt w stopniach: " + angle2.degree());
        System.out.println("\nWartości wybranych funkcji trygonometrycznych.\n");
        System.out.printf("Sinus(%.2f) = %.4f\n", angleValueRad, angle2.getAngleSinus());
        System.out.printf("Cosinus(%.2f) = %.4f\n", angleValueRad, angle2.getAngleCosiunus());
        System.out.printf("Tangens(%.2f) = %.4f\n", angleValueRad, angle2.getAngleTangens());
        System.out.printf("Cotangens(%.2f) = %.4f\n", angleValueRad, angle2.getAngleCotangens());
        System.out.printf("Secans(%.2f) = %.4f\n", angleValueRad, angle2.getAngleSecans());
        System.out.printf("Cosecans(%.2f) = %.4f\n", angleValueRad, angle2.getAngleCosecans());

        System.out.println(angle2);


    }


}
