package gr.aueb.cf.ch15;

public class Point3D  extends Point2D {
    private double z;

    public Point3D() {

    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String convertToString() {
            return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.getZ(), 2));
    }

    @Override
    protected void reset() {
        super.reset();
        z = 0;
    }
}
