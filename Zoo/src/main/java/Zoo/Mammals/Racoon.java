package Zoo.Mammals;

import Zoo.Mammal;
import Zoo.Menu;

public class Racoon extends Mammal {
    String racoonName;
    public Racoon(String racoonName){
        this.racoonName = racoonName;
        this.animalName = "Racoon";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,racoonName);
        Menu.listOfAnimalsName.add(animalName);
    }

    @Override
    public void uniqueAction() {
        System.out.println("He can still your cookies!");;;
    }
}
