package angle;

public class MainAngle {

    public static void main(String[] args) {

        Angle angle = new Angle(3.14);
        double angleValueRad = angle.getAngle();
        System.out.println("K¹t w radianach: " + angle.radian());
        System.out.println("K¹t w stopniach: " + angle.degree());
        System.out.println("\nWartoœci wybranych funkcji trygonometrycznych.");
        System.out.printf("Sinus(%.2f) = %.20f\n", angleValueRad, angle.getAngleSinus());
        System.out.printf("Cosinus(%.2f) = %.20f\n", angleValueRad, angle.getAngleCosiunus());
        System.out.printf("Tangens(%.2f) = %.20f\n", angleValueRad, angle.getAngleTangens());
        System.out.printf("Cotangens(%.2f) = %.20f\n", angleValueRad, angle.getAngleCotangens());
        System.out.printf("Secans(%.2f) = %.20f\n", angleValueRad, angle.getAngleSecans());
        System.out.printf("Cosecans(%.2f) = %.20f\n", angleValueRad, angle.getAngleCosecans());


    }


}
