package gr.aueb.cf.ch15;

import static gr.aueb.cf.ch15.PointUtil.distanceFromOrigin;

public class Main {

    public static void main(String[] args) {
        Point3D jason = new Point3D(3,4,5);
        Point2D nolan = new Point2D(3, 4);
        Point nathan = new Point(9);

        System.out.println(jason.getDistanceFromOrigin());
        System.out.println(distanceFromOrigin(jason));
        System.out.println();

        System.out.println(nolan.getDistanceFromOrigin());
        System.out.println(distanceFromOrigin(nolan));
        System.out.println();

        System.out.println(nathan.getDistanceFromOrigin());
        System.out.println(distanceFromOrigin(nathan));
    }
}
