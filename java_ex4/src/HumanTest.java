public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("black", "positive");
        Hand hand = new Hand("black", "positive", 5, 80);
        Leg leg = new Leg("black", "positive", 5, 110);
        Head head = new Head("black", "positive", "blue", "asian");

        System.out.println("Human " + human.toString());
        System.out.println("Hand " + hand.toString());
        System.out.println("Leg " + leg.toString());
        System.out.println("Head " + head.toString());
    }
}
