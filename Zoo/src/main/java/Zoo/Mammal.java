package Zoo;

public abstract class Mammal extends Animal {
    public String iBreath(){
        String breathAir = "He breaths the air";
        return breathAir;
    }
    public void iMove(){
        System.out.println("He walks the earth");
    }


}
