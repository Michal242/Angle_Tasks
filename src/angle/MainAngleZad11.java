package angle;

public class MainAngleZad11 {

    public static void main(String[] args) {

        Angle angleFirst = new Angle(Math.PI);
        Angle angleSecond = new Angle(2 * Math.PI);

        System.out.println("Wartoœci bazowe k¹tów;");
        System.out.println("AngleFirst : " + " radians [" + angleFirst.radian() + "] ,degrees [" + angleFirst.degree() + "]");
        System.out.println("AngleSecond : " + " radians [" + angleSecond.radian() + "] ,degrees [" + angleSecond.degree() + "]");
        System.out.println();
        System.out.println("Wywo³anie statycznej metody dodawania Angle.add() - powstaje nowy obiekt Angle angleAdded");


        Angle angleAdded = Angle.add(angleFirst, angleSecond);
        System.out.println(angleAdded);
        System.out.println("angleAdded : " + " radians [" + angleAdded.radian() + "] ,degrees [" + angleAdded.degree() + "]");

        System.out.println();
        System.out.println("Wywo³anie statycznej metody odejmowania Angle.diff() - powstaje nowy obiekt Angle angleSubtracted");
        Angle angleSubtratcted = Angle.diff(angleFirst, angleSecond);
        System.out.println(angleSubtratcted);
        System.out.println("angleAdded : " + " radians [" + angleSubtratcted.radian() + "] ,degrees [" + angleSubtratcted.degree() + "]");
    }
}
