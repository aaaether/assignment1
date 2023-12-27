import java.text.DecimalFormat;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point destination) {
        double dx = this.x - destination.x;
        double dy = this.y - destination.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Point(" + df.format(this.x) + ", " + df.format(this.y) + ")";
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        double distance = point1.distanceTo(point2);
        System.out.println("Distance between " + point1 + " and " + point2 + ": " + distance);
    }
}
