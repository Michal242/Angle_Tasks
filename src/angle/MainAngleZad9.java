package angle;

public class MainAngleZad9 {

    public static void main(String[] args) {

        System.out.println("objectAngle = Angle.valueOf(Math.PI)");
        Angle objectAngle = Angle.valueOf(Math.PI);
        System.out.println(objectAngle);

        System.out.println("objectAngle1 = Angle.valueOf(45, 20, 10)");
        Angle objectAngle1 = Angle.valueOf(45, 20, 10);
        System.out.println(objectAngle1);

        System.out.println("objectAngle2 = Angle.valueOf(45, 20)");
        Angle objectAngle2 = Angle.valueOf(45, 20);
        System.out.println(objectAngle2);

        System.out.println("objectAngle3 = Angle.valueOf(45)");
        Angle objectAngle3 = Angle.valueOf(45);
        System.out.println(objectAngle3);

        System.out.println("objectAngle4 = Angle.valueOf(\"90°30'30\"\")");
        Angle objectAngle4 = Angle.valueOf("90°30'30\"");
        System.out.println(objectAngle4);


        System.out.println("objectAngle5 = Angle.valueOf(-1.0,1.0)");
        Angle objectAngle5 = Angle.valueOf(-1.0,1.0);
        System.out.println(objectAngle5);


    }
}
