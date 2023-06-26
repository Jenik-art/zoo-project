package Zoo.Birds;

import Zoo.Animal;
import Zoo.Bird;
import Zoo.Menu;

public class Peacock extends Bird {
     String peacockName;
    public Peacock(String peacockName){
        this.peacockName = peacockName;
        this.animalName = "Peacock";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,peacockName);
        Menu.listOfAnimalsName.add(animalName);
    }

    @Override
    public void uniqueAction() {
        System.out.println("He can spread his amazing tail");
    }
}
