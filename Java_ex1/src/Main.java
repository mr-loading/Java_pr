import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //Dog
        System.out.println("Dog #########################");
        Dog d1 = new Dog("Mike", 4);
        Dog d2 = new Dog( 6);
        Dog d3 = new Dog("Bob");
        d2.setNameDog("Helen");
        d3.setAgeDog(13);
        d1.conversion();
        d2.conversion();
        d3.conversion();
        System.out.println(d1.toString());

        System.out.println();
        //Ball
        System.out.println("Ball ########################");
        Ball b1 = new Ball("Green", 6);
        Ball b2 = new Ball(12);
        Ball b3 = new Ball("Black");
        b2.setColor("Rad");
        b3.setRadius(50);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        System.out.println();
        //Book
        System.out.println("Book ########################");
        Book bo1 = new Book("Egor", 234);
        Book bo2 = new Book( 560);
        Book bo3 = new Book("Arthur");
        bo2.setAuthor("Ashot");
        bo3.setNumOfPages(120);
        System.out.println(bo1.toString());
        System.out.println(bo2.toString());
        System.out.println(bo3.toString());
    }
}