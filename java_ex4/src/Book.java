public class Book {
    private String after;
    private String name;
    private int years;

    public Book(String after, String name, int years){
        this.after = after;
        this.name = name;
        this.years = years;
    }

    public String getAfter() {
        return after;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
