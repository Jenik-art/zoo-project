package Zoo;

import java.util.ArrayList;

public abstract class Animal {
    protected String animalName;
    protected String animalInfo;
    public static ArrayList<String> listOfAnimalsName = new ArrayList<>();
    public static ArrayList<Animal> listOfAnimals = new ArrayList<>();
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

     static public void getListOfAnimal(){
        for (int i = 0; i <= listOfAnimalsName.size() - 1; i++) {
            String animals = String.format("%d. %s", i + 1, listOfAnimalsName.get(i));
            System.out.println(animals);
       }
     }
}
