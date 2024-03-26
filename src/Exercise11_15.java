import java.util.Scanner;

public class Exercise11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        System.out.println("Enter the coordinates of the points:");
        double[][] points = new double[numberOfPoints][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        System.out.println("The total area is " + getConvexPolygonArea(points));
    }

    public static double getConvexPolygonArea(double[][] points) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < points.length; i++) {
            if (i == points.length - 1) {
                sum1 += points[i][0] * points[0][1];
                sum2 += points[i][1] * points[0][0];
            } else {
                sum1 += points[i][0] * points[i + 1][1];
                sum2 += points[i][1] * points[i + 1][0];
            }
        }
        return (0.5 * -1 * (sum1 - sum2));
    }
}
