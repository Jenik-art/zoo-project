package Zoo;

public abstract class Bird extends Animal {
    public String iBreath(){
        String breathAir = "He breaths the air";
        return breathAir;
    }
    public void iMove(){
        System.out.println("He flies in the sky");
    }
}