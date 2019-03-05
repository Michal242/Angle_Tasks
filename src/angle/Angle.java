package angle;

public class Angle {

    private double x;

    public Angle() {
    }

    public Angle(double x) {
        this.x = x;
    }

    public Angle(int degree, int minutes, int seconds) {

        if (degree < 0 || degree > 360) {
            throw new IllegalArgumentException("Podano z�� warto�� k�ta. Podaj liczb� z zakresu 0-360!");
        }
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException("Podano z�� warto�� minut. Podaj liczb� z zakresu 0-60!");
        }
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException("Podano z�� warto�� sekund. Podaj liczb� z zakresu 0-60!");
        }

        x = Math.toRadians(degree + minutes / 60.0 + seconds / 3600.0);
    }

    public Angle(int degree, int minutes) {

        if (degree < 0 || degree > 360) {
            throw new IllegalArgumentException("Podano z�� warto�� k�ta. Podaj liczb� z zakresu 0-360!");
        }
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException("Podano z�� warto�� minut. Podaj liczb� z zakresu 0-60!");
        }

        x = Math.toRadians(degree + minutes / 60.0);

    }

    public Angle(int degree) {

        if (degree < 0 || degree > 360) {
            throw new IllegalArgumentException("Podano z�� warto�� k�ta. Podaj liczb� z zakresu 0-360!");
        }

        x = Math.toRadians(degree);

    }

    //105�30'15"

    public Angle(String angle) {

        String strDegrees = "0";
        String strMinutes = "0";
        String strSeconds = "0";

        strDegrees = angle.substring(0, angle.indexOf('�'));
        strMinutes = angle.substring(angle.indexOf('�') + 1, angle.indexOf('\''));
        strSeconds = angle.substring(angle.indexOf('\'') + 1, angle.indexOf('\"'));

        double degrees = Double.parseDouble(strDegrees);
        double minutes = Double.parseDouble(strMinutes);
        double seconds = Double.parseDouble(strSeconds);

        x = Math.toRadians(degrees + minutes / 60 + seconds / 3600);

        System.out.println(degrees);
        System.out.println(minutes);
        System.out.println(seconds);

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

    public void setOfArcusSinus(double value) {
        x = Math.asin(value);
    }

    public void setOfArcusCosinus(double value) {
        x = Math.acos(value);
    }

    public void setOfArcusTangens(double value) {
        x = Math.atan(value);
    }

    public void setOfArcusCotangens(double value) {
        x = Math.PI / 2 - Math.atan(value);
    }

    public void setOfArcusSecans(double value) {
        x = Math.acos(1.0 / value);
    }

    public void setOfArcusCosecans(double value) {
        x = Math.asin(1.0d / value);
    }

    @Override
    public String toString() {

        String degree = Double.toString((float) Math.toDegrees(x));
        String degreeFinal = degree;
        String decimalPlaces = "";
        String minutesString = "0";
        String secondsString = "0";
        double minutes = 0.0;
        double seconds = 0.0;

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
            minutes = Double.parseDouble("0." + decimalPlaces) * 60.0;
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
        return "K�t = " + degreeFinal + "� " + minutesString + "' " + secondsString + "\"";

                /*+"\n" +
                "Angle in \" = " + ((Math.toDegrees(x) * 3600)) + "\n" +
                degreeFinal;

*/
    }
}
