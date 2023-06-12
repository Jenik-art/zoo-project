package Zoo.Fishes;

import Zoo.Fish;

public class Sawfish extends Fish {
    String sawfishName;
    public Sawfish(String sawfishName){
        this.sawfishName = sawfishName;
        this.animalName = "SawfishName";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,sawfishName);
        listOfAnimals.add(animalName);
    }

    @Override
    public void uniqueAction() {
        System.out.println("He likes saw Neptune's budget :)");;
    }
}
