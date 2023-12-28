public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Movable pointer
        MovablePoint mp = new MovablePoint(100, 100, 20, 20);
        mp.moveDown();
        mp.moveRight();
        System.out.println(mp.toString());

        System.out.println();
        // Movable Circle
        MovebleCircle mc = new MovebleCircle(100, 100, 50, 50, 30);
        mc.moveUp();
        mc.moveLeft();
        System.out.println(mc.toString());

        System.out.println();
        //  Movable Rectangle
        MovableRectangle mr = new MovableRectangle(100, 100, 150, 150, 30, 30);
        mr.moveUp();
        mr.moveRight();
        System.out.println(mr.toString());

    }
}