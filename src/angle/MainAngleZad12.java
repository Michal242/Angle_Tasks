package angle;

public class MainAngleZad12 {

    public static void main(String[] args) {

        Angle angle = new Angle(Math.PI);

        // ------ metody mno��ce ------

        System.out.println(" ------------------------------ Metody mno��ce ----------");


        System.out.println("Warto�� bazowa k�ta;");
        System.out.println("angle : " + " radians [" + angle.radian() + "] ,degrees [" + angle.degree() + "]");
        System.out.println();
        System.out.println("Wywo�anie metody mno��cej przez liczb� ca�kowit� angle.mult(2) - powstaje nowy obiekt Angle");

        Angle angleMultiplied = angle.mult(2);
        System.out.println("angleMultiplied: " + angleMultiplied);
        System.out.println("Degrees : " + angleMultiplied.degree());
        System.out.println("Radians " + angleMultiplied.radian());
        System.out.println();

        System.out.println("Warto�� bazowa k�ta;");
        System.out.println("angle : " + " radians [" + angle.radian() + "] ,degrees [" + angle.degree() + "]");
        System.out.println();
        System.out.println("Wywo�anie metody mno��cej przez liczb� zmiennoprzecinkow� angle.mult(0.125) - powstaje nowy obiekt Angle");




        Angle angleMultipliedDouble = angle.mult(0.125);
        System.out.println("angleMultipliedDouble: " + angleMultipliedDouble);
        System.out.println("Degrees : " + angleMultipliedDouble.degree());
        System.out.println("Radians : " + angleMultipliedDouble.radian());
        System.out.println();
        System.out.println(" ------------------------------ Metody dziel�ce ----------");

        // ------ metody dziel�ce -------

        System.out.println("Warto�� bazowa k�ta;");
        System.out.println("angle : " + " radians [" + angle.radian() + "] ,degrees [" + angle.degree() + "]");
        System.out.println();
        System.out.println("Wywo�anie metody dziel�cej przez liczb� ca�kowit� angle.div(2) - powstaje nowy obiekt Angle");

        Angle angleDivided = angle.div(2);
        System.out.println("angleDivided: " + angleDivided);
        System.out.println("Degrees : " + angleDivided.degree());
        System.out.println("Radians " + angleDivided.radian());
        System.out.println();

        System.out.println("Warto�� bazowa k�ta;");
        System.out.println("angle : " + " radians [" + angle.radian() + "] ,degrees [" + angle.degree() + "]");
        System.out.println();
        System.out.println("Wywo�anie metody dziel�cej przez liczb� zmiennoprzecinkow� angle.div(0.125) - powstaje nowy obiekt Angle");

        Angle angleDividedDouble = angle.div(1.125345);
        System.out.println("angleDividedDouble: " + angleDividedDouble);
        System.out.println("Degrees : " + angleDividedDouble.degree());
        System.out.println("Radians : " + angleDividedDouble.radian());


    }
}

