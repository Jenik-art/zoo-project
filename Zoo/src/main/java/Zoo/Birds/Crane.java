package Zoo.Birds;

import Zoo.Bird;

public class Crane extends Bird {
    String craneName;
    public Crane(String craneName){
        this.craneName = craneName;
        this.animalName = "Crane";
        this.animalInfo = String.format("It's a %s, his name is %s",animalName,craneName);
        listOfAnimalsName.add(animalName);
    }

    @Override
    public void uniqueAction() {
        System.out.println("His neck bends when he fly");;
    }
}
