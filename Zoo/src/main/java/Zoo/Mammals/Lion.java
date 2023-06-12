package Zoo.Mammals;

import Zoo.Mammal;

public class Lion extends Mammal {
    String lionName;
    public Lion(String lionName){
        this.lionName = lionName;
        this.animalName = "Lion";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,lionName);
        listOfAnimals.add(animalName);
    }


    @Override
    public void uniqueAction() {
        System.out.println("He can growl: Rrrrrr!");;
    }

}
