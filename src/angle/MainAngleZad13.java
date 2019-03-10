package angle;

public class MainAngleZad13 {

    public static void main(String[] args) {

        Angle angle = new Angle(Math.PI);

        // ------ metody mnożące ------

        System.out.println(" ------------------------------ Metoda mnożąca ----------");


        System.out.println("Wartość bazowa kąta;");
        System.out.println("angle : " + " radians [" + angle.radian() + "] ,degrees [" + angle.degree() + "]");
        System.out.println();
        System.out.println("Wywołanie metody mnożącej przez liczbę angle.prod(angle, 2) np. 2 - powstaje nowy obiekt klasy Angle");

        Angle angleMultipliedByNumber = angle.prod(angle,2);
        System.out.println("angleMultipliedByNumber: " + angleMultipliedByNumber);
        System.out.println("Degrees : " + angleMultipliedByNumber.degree());
        System.out.println("Radians " + angleMultipliedByNumber.radian());
        System.out.println();


        System.out.println();
        System.out.println(" ------------------------------ Metoda dzieląca ----------");

        // ------ metody dzielące -------

        System.out.println("Wartość bazowa kąta;");
        System.out.println("angle : " + " radians [" + angle.radian() + "] ,degrees [" + angle.degree() + "]");
        System.out.println();
        System.out.println("Wywołanie metody dzielącej przez liczbę angle.quot(angle, 2) np. 2 - powstaje nowy obiekt klasy Angle");

        Angle angleDividedByNumber = angle.quot(angle,2.0);
        System.out.println("angleDivided: " + angleDividedByNumber);
        System.out.println("Degrees : " + angleDividedByNumber.degree());
        System.out.println("Radians " + angleDividedByNumber.radian());
        System.out.println();


    }
}

