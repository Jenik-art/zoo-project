package Zoo.Fishes;

import Zoo.Fish;

public class Shark extends Fish {
    String sharkName;
    public Shark(String sharkName){
        this.sharkName = sharkName;
        this.animalName = "Shark";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,sharkName);
        listOfAnimalsName.add(animalName);
    }

    @Override
    public void uniqueAction() {
        System.out.println("He likes bite people");;
    }
}
