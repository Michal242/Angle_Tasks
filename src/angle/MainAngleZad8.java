package angle;

public class MainAngleZad8 {

    public static void main(String[] args) {

        Angle angle = new Angle (1.0,1.0);
        System.out.println(angle);

        double[][] points = new double [][] {{1,0}, {1,1}, {0,1}, {-1,1}, {-1,0}, {-1,-1}, {0,-1}, {1,-1}};

        for (int i=0 ; i < points.length ; i++) {
            angle = new Angle(points[i][0],points[i][1]);

            System.out.println("Punkt (" + points[i][0] + "," + points[i][1] + ") - " + angle);
        }


    }
}
