package angle;

public class MainAngleZad10 {

    public static void main(String[] args) {

        Angle angleFirst = new Angle(Math.PI);
        Angle angleSecond = new Angle(2 * Math.PI);

        System.out.println("Warto�ci bazowe k�t�w;");
        System.out.println("AngleFirst : " + " radians [" + angleFirst.radian() + "] ,degrees [" + angleFirst.degree() + "]");
        System.out.println("AngleSecond : " + " radians [" + angleSecond.radian() + "] ,degrees [" + angleSecond.degree() + "]");
        System.out.println();
        System.out.println("Wywo�anie metody dodawania add() - powstaje nowy obiekt Angle angleAdded");


        Angle angleAdded = angleFirst.add((angleSecond));
        System.out.println(angleAdded);
        System.out.println("angleAdded : " + " radians [" + angleAdded.radian() + "] ,degrees [" + angleAdded.degree() + "]");

        System.out.println();
        System.out.println("Wywo�anie metody odejmowania sub() - powstaje nowy obiekt Angle angleSubtracted");
        Angle angleSubtratcted = angleFirst.sub((angleSecond));
        System.out.println(angleSubtratcted);
        System.out.println("angleAdded : " + " radians [" + angleSubtratcted.radian() + "] ,degrees [" + angleSubtratcted.degree() + "]");




    }
}
