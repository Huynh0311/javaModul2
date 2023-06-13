package collection_6.Point2D_Point3D;

public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D( 1.5F, 2.5F);
        Point3D point3D = new Point3D(1.5F, 2.5F,3.5F);
        System.out.println(point2D);
        System.out.println(point3D);
        point3D.setXYZ(6.5F, 7.5F, 8.5F);
        System.out.println(point3D);
    }
}
