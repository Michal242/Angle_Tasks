package angle;

public class MainAngleZad7 {

    public static void main(String[] args) {

        Angle angle = new Angle (47);
        System.out.println(angle);

        int[][] points = new int [][] {{1,0}, {1,1}, {0,1}, {-1,1}, {-1,0}, {-1,-1}, {0,-1}, {1,-1}};

        for (int i=0 ; i < points.length ; i++) {
            angle.setOfPoint(points[i][0],points[i][1]);

            System.out.println("Punkt (" + points[i][0] + "," + points[i][1] + ") - " + angle);
        }


    }
}
