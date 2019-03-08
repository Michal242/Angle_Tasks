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
            throw new IllegalArgumentException("Podano z³¹ wartoœæ k¹ta. Podaj liczbê z zakresu 0-360!");
        }
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ minut. Podaj liczbê z zakresu 0-60!");
        }
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ sekund. Podaj liczbê z zakresu 0-60!");
        }

        x = Math.toRadians(degree + minutes / 60.0 + seconds / 3600.0);
    }

    public Angle(int degree, int minutes) {

        if (degree < 0 || degree > 360) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ k¹ta. Podaj liczbê z zakresu 0-360!");
        }
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ minut. Podaj liczbê z zakresu 0-60!");
        }

        x = Math.toRadians(degree + minutes / 60.0);

    }

    public Angle(int degree) {

        if (degree < 0 || degree > 360) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ k¹ta. Podaj liczbê z zakresu 0-360!");
        }

        x = Math.toRadians(degree);

    }

    //105°30'15"

    public Angle(String angle) {

        String strDegrees = "0";
        String strMinutes = "0";
        String strSeconds = "0";

        strDegrees = angle.substring(0, angle.indexOf('°'));
        strMinutes = angle.substring(angle.indexOf('°') + 1, angle.indexOf('\''));
        strSeconds = angle.substring(angle.indexOf('\'') + 1, angle.indexOf('\"'));

        double degrees = Double.parseDouble(strDegrees);
        double minutes = Double.parseDouble(strMinutes);
        double seconds = Double.parseDouble(strSeconds);

        x = Math.toRadians(degrees + minutes / 60 + seconds / 3600);

        System.out.println(degrees);
        System.out.println(minutes);
        System.out.println(seconds);

    }

    public Angle(double x, double y) {

        double angleValue = Math.atan2(y, x);
        this.x = angleValue >= 0 ? angleValue : angleValue + 2 * Math.PI;
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

    public void setOfPoint(double x, double y) {
        double angleValue = Math.atan2(y, x);
        this.x = angleValue >= 0 ? angleValue : angleValue + 2 * Math.PI;
    }

    public Angle add(Angle objectAngle) {
        double addedAngle = this.getAngle() + objectAngle.getAngle();
        return new Angle(addedAngle);
    }

    public Angle sub(Angle objectAngle) {
        double addedAngle = this.getAngle() - objectAngle.getAngle();
        return new Angle(addedAngle);
    }

    public Angle mult(int number) {
        double multipliedAngle = x * number;
        return new Angle(multipliedAngle);
    }

    public Angle mult(double number) {
        double multipliedAngle = x * number;
        return new Angle(multipliedAngle);
    }

    public Angle div(int number) {

        double dividedAngle = x / number;
        if (number == 0) {
            throw new ArithmeticException("Próba dzielenia przez 0!!!");
        }
        return new Angle(dividedAngle);
    }

    public Angle div(double number) {

        if (number == 0) {
            throw new ArithmeticException("Próba dzielenia przez 0!!!");
        }

        double dividedAngle = x / number;

        return new Angle(dividedAngle);
    }

    public Angle prod(Angle angleObject, double number) {

        double resultAngle = angleObject.getAngle() * number;

        return new Angle(resultAngle);
    }

    public Angle quot(Angle angleObject, double number) {

        if (number == 0) {
            throw new ArithmeticException("Próba dzielenia przez 0!!!");
        }

        double resultAngle = angleObject.getAngle() / number;
        return new Angle(resultAngle);
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
            minutes = Double.parseDouble("0." + decimalPlaces) * 60.0;
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
        return "K¹t = " + degreeFinal + "° " + minutesString + "' " + secondsString + "\"";

    }

    public static Angle valueOf(double x) {
        return new Angle(x);

    }

    public static Angle valueOf(int degree, int minutes, int seconds) {

        if (degree < 0 || degree > 360) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ k¹ta. Podaj liczbê z zakresu 0-360!");
        }
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ minut. Podaj liczbê z zakresu 0-60!");
        }
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ sekund. Podaj liczbê z zakresu 0-60!");
        }

        double angleValue = Math.toRadians(degree + minutes / 60.0 + seconds / 3600.0);
        return new Angle(angleValue);
    }

    public static Angle valueOf(int degree, int minutes) {

        if (degree < 0 || degree > 360) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ k¹ta. Podaj liczbê z zakresu 0-360!");
        }
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ minut. Podaj liczbê z zakresu 0-60!");
        }

        double angleValue = Math.toRadians(degree + minutes / 60.0);
        return new Angle(angleValue);

    }

    public static Angle valueOf(int degree) {

        if (degree < 0 || degree > 360) {
            throw new IllegalArgumentException("Podano z³¹ wartoœæ k¹ta. Podaj liczbê z zakresu 0-360!");
        }

        double angleValue = Math.toRadians(degree);
        return new Angle(angleValue);
    }

    public static Angle valueOf(String angle) {

        String strDegrees = "0";
        String strMinutes = "0";
        String strSeconds = "0";

        strDegrees = angle.substring(0, angle.indexOf('°'));
        strMinutes = angle.substring(angle.indexOf('°') + 1, angle.indexOf('\''));
        strSeconds = angle.substring(angle.indexOf('\'') + 1, angle.indexOf('\"'));

        double degrees = Double.parseDouble(strDegrees);
        double minutes = Double.parseDouble(strMinutes);
        double seconds = Double.parseDouble(strSeconds);

        double angleValue = Math.toRadians(degrees + minutes / 60 + seconds / 3600);
        return new Angle(angleValue);

    }

    public static Angle valueOf(double x, double y) {

        double angleValue = Math.atan2(y, x);
        double angleToReturn = angleValue >= 0 ? angleValue : angleValue + 2 * Math.PI;
        return new Angle(angleToReturn);
    }

    public static Angle add(Angle objectAngle1, Angle objectAngle2) {
        double angleToReturn = objectAngle1.getAngle() + objectAngle2.getAngle();
        return new Angle(angleToReturn);
    }

    public static Angle diff(Angle objectAngle1, Angle objectAngle2) {
        double angleToReturn = objectAngle1.getAngle() - objectAngle2.getAngle();
        return new Angle(angleToReturn);
    }


}



