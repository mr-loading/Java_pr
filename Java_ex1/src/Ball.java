import java.lang.*;

public class Ball {
    private String color;
    private int radius;

    public Ball(String color, int radius){
        this.color = color;
        this.radius = radius;
    }

    public Ball(String color){
        this.color = color;
    }

    public Ball(int radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return color + ", " + radius;
    }
}
