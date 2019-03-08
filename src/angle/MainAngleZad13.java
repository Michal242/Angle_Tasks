package angle;

public class MainAngleZad13 {

    public static void main(String[] args) {

        Angle angle = new Angle(Math.PI);

        // ------ metody mno¿¹ce ------

        System.out.println(" ------------------------------ Metoda mno¿¹ca ----------");


        System.out.println("Wartoœæ bazowa k¹ta;");
        System.out.println("angle : " + " radians [" + angle.radian() + "] ,degrees [" + angle.degree() + "]");
        System.out.println();
        System.out.println("Wywo³anie metody mno¿¹cej przez liczbê angle.prod(angle, 2) np. 2 - powstaje nowy obiekt klasy Angle");

        Angle angleMultipliedByNumber = angle.prod(angle,2);
        System.out.println("angleMultipliedByNumber: " + angleMultipliedByNumber);
        System.out.println("Degrees : " + angleMultipliedByNumber.degree());
        System.out.println("Radians " + angleMultipliedByNumber.radian());
        System.out.println();


        System.out.println();
        System.out.println(" ------------------------------ Metoda dziel¹ca ----------");

        // ------ metody dziel¹ce -------

        System.out.println("Wartoœæ bazowa k¹ta;");
        System.out.println("angle : " + " radians [" + angle.radian() + "] ,degrees [" + angle.degree() + "]");
        System.out.println();
        System.out.println("Wywo³anie metody dziel¹cej przez liczbê angle.quot(angle, 2) np. 2 - powstaje nowy obiekt klasy Angle");

        Angle angleDividedByNumber = angle.quot(angle,2.0);
        System.out.println("angleDivided: " + angleDividedByNumber);
        System.out.println("Degrees : " + angleDividedByNumber.degree());
        System.out.println("Radians " + angleDividedByNumber.radian());
        System.out.println();


    }
}

