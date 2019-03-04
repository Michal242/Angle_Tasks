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

        /* sprawdzenie czy stopnie s¹ liczb¹ zmiennoprzecinkow¹, je¿eli tak to
            wykonanie odpowiednich kalkulacji w celu wydobycia minut i sekund,
            jeœli nie stopnie zostaj¹ tak ja s¹.
        */

        if (degree.contains(".")) {
            // ------- Obliczenie samych stopni ------

            // wytnij i wez wszysko z przed '.' to bêd¹ stopnie

            degreeFinal = degree.substring(0, degree.indexOf("."));

            // ------ Obliczenie pzosta³ych minut ------

            // wez wszystko za kropk¹ (ze stopni), nastêpnie dodaj '0.' przed, otrzymamy czêœæ
            // u³amkow¹, nastepnie przemnozymy przez 60 i otrzymamy minuty

            decimalPlaces = degree.substring(degree.indexOf(".") + 1);
            minutes = Double.parseDouble("0." + decimalPlaces) * 60;
            minutesString = String.valueOf(minutes);

            // ------ Obliczenie pzosta³ych sekund ------

            // wez wszystko za kropk¹ (z minut), nastêpnie dodaj '0.' przed, otrzymamy czêœæ
            // u³amkow¹, nastepnie przemnozymy przez 60 i otrzymamy sekundy, wynik zaokr¹glamy
            // bo nie potrzebujemy czêœci u³¹mkowej z sekund ju¿ do niczego.

            decimalPlaces = minutesString.substring(minutesString.indexOf(".") + 1);
            seconds = Double.parseDouble("0." + decimalPlaces) * 60;
            secondsString = String.valueOf(Math.round(seconds));

            // tu odrzuæ jeszcze czêœæ u³amkow¹ z minut, bierz tylko ca³kowite wartoœci,
            //    reszta (czêœæ u³amkowa) zosta³a przekonwertowana na sekundy
            minutesString = minutesString.substring(0, minutesString.indexOf("."));
        }
        return "\nK¹t = " + degreeFinal + "° " + minutesString + "' " + secondsString + "\"";

                /*+"\n" +
                "Angle in \" = " + ((Math.toDegrees(x) * 3600)) + "\n" +
                degreeFinal;

*/
    }
}
