package Zoo;

public abstract class Fish extends Animal {
    public String iBreath(){
        String breathWater = "He breaths the water";
        return breathWater;
    }
    public void iMove(){
        System.out.println("He swims in the water");
    }
}
