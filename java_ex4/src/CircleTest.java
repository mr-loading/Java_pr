public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(5, 3, 4);
        System.out.println("radius = " + c.getRadius());
        c.setRadius(10);
        System.out.println("radius = " + c.getRadius());
        System.out.println("X center = " + c.getXCenter());
        System.out.println("Y center = " + c.getYCenter());
    }
}