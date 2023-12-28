public class Leg extends Human{
    private int count_fingers;
    private int length;

    public Leg(String color, String blood_type, int count_fingers, int length){
        super(color, blood_type);
        this.count_fingers = count_fingers;
        this.length = length;
    }

    public int getCount_fingers() {
        return count_fingers;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return (count_fingers + " " + length);
    }
}
