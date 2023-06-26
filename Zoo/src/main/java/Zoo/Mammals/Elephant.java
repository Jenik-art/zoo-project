package Zoo.Mammals;

import Zoo.Mammal;
import Zoo.Menu;



public class Elephant extends Mammal {
    String elephantName;
    public Elephant(String elephantName){
        this.elephantName = elephantName;
        this.animalName = "Elephant";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,elephantName);
        Menu.listOfAnimalsName.add(animalName);
    }

    @Override
    public void uniqueAction() {
        System.out.println("He can use the trunk like a hand ");;
    }

}
