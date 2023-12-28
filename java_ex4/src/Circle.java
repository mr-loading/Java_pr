public class Circle {
    private int radius;
    private int xCenter;
    private int yCenter;

    public Circle(int radius, int xCanter, int yCanter){
        this.radius = radius;
        this.xCenter = xCanter;
        this.yCenter = yCanter;
    }

    public int getRadius() {
        return radius;
    }

    public int getXCenter() {
        return xCenter;
    }

    public int getYCenter() {
        return yCenter;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setXCenter(int xCanter) {
        this.xCenter = xCanter;
    }

    public void setYCenter(int yCanter) {
        this.yCenter = yCanter;
    }
}
