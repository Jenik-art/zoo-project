package Zoo.Birds;

import Zoo.Bird;

public class Peacock extends Bird {
    String peacockName;
    public Peacock(String peacockName){
        this.peacockName = peacockName;
        this.animalName = "Peacock";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,peacockName);
        listOfAnimalsName.add(animalName);
    }

    @Override
    public void uniqueAction() {
        System.out.println("He can spread his amazing tail");;
    }
}
