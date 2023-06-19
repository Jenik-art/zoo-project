package Zoo;

import java.util.ArrayList;

public abstract class Animal {
    protected String animalName;
    protected String animalInfo;
    public abstract void iMove();
    public abstract void iBreath();
    public abstract void uniqueAction();
    public void getAnimalName(){     // Addition method to get animal name
        System.out.println(animalName);
    }
    public void getAllInfo(){
        getAnimal();
        iBreath();
        iMove();
        uniqueAction();
    }

    public void getAnimal(){
        System.out.println(animalInfo);
    }


}
