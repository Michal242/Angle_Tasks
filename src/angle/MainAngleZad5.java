package angle;

public class MainAngleZad5 {

    public static void main(String[] args) {

        Angle angle = new Angle("90°30'30\"");

        System.out.println();
        System.out.println("K¹t w radianach: " + angle.radian());
        System.out.println("K¹t w stopniach: " + angle.degree());
        System.out.println(angle);

        System.out.println(Math.toDegrees(Math.asin(1)));
        System.out.println(Math.toDegrees(Math.acos(-0.5)));
        System.out.println(Math.toDegrees(Math.atan(0)));
        System.out.println(Math.toDegrees(Math.PI / 2 - Math.atan(0)));
        System.out.println("arsecans = " + Math.toDegrees(Math.acos(1.0d / 2.0d)));
        System.out.println("arcosecans = " + (Math.toDegrees(Math.asin(1.0d / 2.0d))));


        // arcsin + arccos = PI/2 dla ka¿dego x nale¿¹cego do -1..1
        // arctg + arcctg = PI/2 dla ka¿dego x nale¿¹cego do R
        // tg x = sinx / cosx
        // ctg x = cosx / sinx
        // ar secans 1/x = arcos x , arcos 1/x = ar secans x
        // ar cosecans 1/x = arsinx, arsin 1/x = ar cosecans x

        /*
        sec z = 1 / cos z
csc z = 1 / sin z
³ó¿eczko z = 1 / tan z
asec z = acos 1 / z
acsc z = acos 1 / z
acot z = atan 1 / z

         */
    }
}
