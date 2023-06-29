package Zoo;

public abstract class Bird extends Animal {
    public String iBreath(){
        String breathAir = "He breaths the air";
        return breathAir;
    }
    public String iMove(){
        String fliesInTheSky = "He flies in the sky";
        return fliesInTheSky;
    }
}