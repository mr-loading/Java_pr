import java.lang.*;

public class Dog {
    private String nameDog;
    private int ageDog;

    public Dog(String _nameDog, int _ageDog){
        this.nameDog = _nameDog;
        this.ageDog = _ageDog;
    }

    public Dog(String _nameDog){
        this.nameDog = _nameDog;
    }

    public Dog(int _ageDog){
        this.ageDog = _ageDog;
    }

    public String getNameDog(){
        return nameDog;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public void setNameDog(String _nameDog) {
        this.nameDog = _nameDog;
    }

    public void setAgeDog(int _ageDog) {
        this.ageDog = _ageDog;
    }

    public void conversion(){
        System.out.println("Возраст в человеческих годах: " + ageDog * 7);
    }

    public String toString(){
        return nameDog + ", " + ageDog;
    }
}
