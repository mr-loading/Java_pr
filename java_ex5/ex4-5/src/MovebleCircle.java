public class MovebleCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovebleCircle (int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Center: " + center.toString() + " radius: " + radius;
    }

    @Override
    public void moveUp(){
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
