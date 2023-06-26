package Zoo.Birds;

import Zoo.Bird;
import Zoo.Menu;

public class Crow extends Bird {
    String crowName;
    public Crow(String crowName){
        this.crowName = crowName;
        this.animalName = "Crow";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,crowName);
        Menu.listOfAnimalsName.add(animalName);
    }

    @Override
    public void uniqueAction() {
        System.out.println("He is one of the smartest birds");;
    }
}
