package Zoo;

import java.util.ArrayList;

public abstract class Animal {
    protected static String animalName;
    protected  String animalInfo;
    public abstract String iMove();
    public abstract String iBreath();
    public abstract void uniqueAction();
    public static void getAnimalName(){     // Addition method to get animal name
        System.out.println(animalName);
    }
    public void getAllInfo(){
        getAnimal();
        System.out.println(iBreath());
        iMove();
        uniqueAction();
    }

    public  void getAnimal(){
        System.out.println(animalInfo);
    }


}
