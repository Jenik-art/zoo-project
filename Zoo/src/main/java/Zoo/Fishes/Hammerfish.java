package Zoo.Fishes;

import Zoo.Fish;

public class Hammerfish extends Fish {
    String hammerfishName;
    public Hammerfish(String hammerfishName){
        this.hammerfishName = hammerfishName;
        this.animalName = "Hammerfish";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,hammerfishName);
        listOfAnimals.add(animalName);
    }

    @Override
    public void uniqueAction() {
        System.out.println("He can look right and left at the same time");;
    }
}
