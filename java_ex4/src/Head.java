public class Head extends Human{
    private String color_eyes;
    private String type_head;

    public Head(String color, String blood_type, String color_eyes, String type_head){
        super (color, blood_type);
        this.color_eyes = color_eyes;
        this.type_head = type_head;
    }

    public String getColor_eyes() {
        return color_eyes;
    }

    public String getType_head() {
        return type_head;
    }

    @Override
    public String toString() {
        return (color_eyes + " " + type_head);
    }
}
