package Zoo;

import java.util.ArrayList;

public abstract class Animal {
    protected String animalName;
    protected String animalInfo;
    protected static ArrayList<String> listOfAnimals = new ArrayList<>();
    public abstract void iMove();
    public abstract void iBreath();
    public abstract void uniqueAction();
    public void getAnimalName(){     // Addition method to get animal name
        System.out.println(animalName);
    }

    public void getAnimal(){
        System.out.println(animalInfo);
    }

     static public void getListOfAnimal(){
        for (int i = 0; i <= listOfAnimals.size() - 1; i++) {
            String animals = String.format("%d. %s", i + 1, listOfAnimals.get(i));
            System.out.println(animals);
       }
     }
}
