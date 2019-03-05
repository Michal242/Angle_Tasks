package angle;

public class MainANgleZad6 {

    public static void main(String[] args) {


        Angle angle = new Angle(20, 15, 10);
        System.out.println("K¹t bazowy:");
        System.out.println(angle);
        System.out.println();

        System.out.println("Metoda: setOfArcusSinus(1):");
        angle.setOfArcusSinus(1);
        System.out.println(angle.degree());
        System.out.println(angle.radian());
        System.out.println(angle);
        System.out.println();

        System.out.println("Metoda: setOfArcusCosinus(0.5):");
        angle.setOfArcusCosinus(0.5);
        System.out.println(angle.degree());
        System.out.println(angle.radian());
        System.out.println(angle);
        System.out.println();

        System.out.println("Metoda: setOfArcusTangens(1):");
        angle.setOfArcusTangens(1);
        System.out.println(angle.degree());
        System.out.println(angle.radian());
        System.out.println(angle);
        System.out.println();

        System.out.println("Metoda: setOfArcusCotangens(sqrt(3)):");
        angle.setOfArcusCotangens(Math.sqrt(3));
        System.out.println(angle.degree());
        System.out.println(angle.radian());
        System.out.println(angle);
        System.out.println();

        System.out.println("Metoda: setOfArcusSecans(2):");
        angle.setOfArcusSecans(2);
        System.out.println(angle.degree());
        System.out.println(angle.radian());
        System.out.println(angle);
        System.out.println();

        System.out.println("Metoda: setOfArcusCosecans(2):");
        angle.setOfArcusCosecans(2);
        System.out.println(angle.degree());
        System.out.println(angle.radian());
        System.out.println(angle);
        System.out.println();



    }
}
