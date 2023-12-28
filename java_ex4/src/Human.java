public class Human {
    private String color;
    private String blood_type;

    public Human(String color, String blood_type){
        this.color = color;
        this.blood_type = blood_type;
    }

    public String getColor() {
        return color;
    }

    public String getBlood_type() {
        return blood_type;
    }

    @Override
    public String toString() {
        return (color + " " + blood_type);
    }
}
