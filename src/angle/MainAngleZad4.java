package angle;

public class MainAngleZad4 {


    public static void main(String[] args) {

        Angle angle = new Angle(180, 15, 30);

        double angleValueRad = angle.getAngle();
        System.out.println("Kąt w radianach: " + angle.radian());
        System.out.println("Kąt w stopniach: " + angle.degree());

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

        Angle angle1 = new Angle(45,5);
        System.out.println();
        System.out.println("Kąt w radianach: " + angle1.radian());
        System.out.println("Kąt w stopniach: " + angle1.degree());
        System.out.println(angle1);

        Angle angle2 = new Angle(5);
        System.out.println();
        System.out.println("Kąt w radianach: " + angle2.radian());
        System.out.println("Kąt w stopniach: " + angle2.degree());
        System.out.println(angle2);


    }


}







