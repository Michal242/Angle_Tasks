package angle;

public class Angle {

    private double x;

    public Angle() {
    }

    public Angle(double x) {
        this.x = x;
    }

    public double getAngle() {
        return x;
    }

    public double getAngleSinus() {
        return Math.sin(x);
    }

    public double getAngleCosiunus() {
        return Math.cos(x);
    }

    public double getAngleTangens() {
        return Math.tan(x);
    }

    public double getAngleCotangens() {
        return 1.0 / Math.tan(x);
    }

    public double getAngleSecans() {
        return 1.0 / Math.sin(x);
    }

    public double getAngleCosecans() {
        return 1.0 / Math.cos(x);
    }

    public double radian() {
        return x;
    }

    public double degree() {
        return Math.toDegrees(x);

    }

    @Override
    public String toString() {

        String degree = Double.toString(Math.toDegrees(x));
        String degreeFinal = degree;
        String decimalPlaces = "";
        String minutesString = "0";
        String secondsString = "0";
        double minutes;
        double seconds;

        /* sprawdzenie czy stopnie s� liczb� zmiennoprzecinkow�, je�eli tak to
            wykonanie odpowiednich kalkulacji w celu wydobycia minut i sekund,
            je�li nie stopnie zostaj� tak ja s�.
        */

        if (degree.contains(".")) {
            // ------- Obliczenie samych stopni ------

            // wytnij i wez wszysko z przed '.' to b�d� stopnie

            degreeFinal = degree.substring(0, degree.indexOf("."));

            // ------ Obliczenie pzosta�ych minut ------

            // wez wszystko za kropk� (ze stopni), nast�pnie dodaj '0.' przed, otrzymamy cz��
            // u�amkow�, nastepnie przemnozymy przez 60 i otrzymamy minuty

            decimalPlaces = degree.substring(degree.indexOf(".") + 1);
            minutes = Double.parseDouble("0." + decimalPlaces) * 60;
            minutesString = String.valueOf(minutes);

            // ------ Obliczenie pzosta�ych sekund ------

            // wez wszystko za kropk� (z minut), nast�pnie dodaj '0.' przed, otrzymamy cz��
            // u�amkow�, nastepnie przemnozymy przez 60 i otrzymamy sekundy, wynik zaokr�glamy
            // bo nie potrzebujemy cz�ci u��mkowej z sekund ju� do niczego.

            decimalPlaces = minutesString.substring(minutesString.indexOf(".") + 1);
            seconds = Double.parseDouble("0." + decimalPlaces) * 60;
            secondsString = String.valueOf(Math.round(seconds));

            // tu odrzu� jeszcze cz�� u�amkow� z minut, bierz tylko ca�kowite warto�ci,
            //    reszta (cz�� u�amkowa) zosta�a przekonwertowana na sekundy
            minutesString = minutesString.substring(0, minutesString.indexOf("."));
        }
        return "\nK�t = " + degreeFinal + "� " + minutesString + "' " + secondsString + "\"";

                /*+"\n" +
                "Angle in \" = " + ((Math.toDegrees(x) * 3600)) + "\n" +
                degreeFinal;

*/
    }
}
