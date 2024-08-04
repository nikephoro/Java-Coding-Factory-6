package gr.aueb.cf.ch15;

public class Point2D extends Point {
    private double y;

    public Point2D() {
//        super();  Δεν χρειάζεται να το γράψουμε γιατί το κάνει αυτόματα το JVM
//        y = 0;   Ομοίως γιατί αρχικοποιεί στο 0
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String convertToString() {
        return "(" + getX() + "," + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));

    }

    @Override
    protected void reset() {
        super.reset();
        y = 0;
    }
}
