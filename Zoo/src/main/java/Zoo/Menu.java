package Zoo;

import Zoo.Birds.Crane;
import Zoo.Birds.Crow;
import Zoo.Birds.Peacock;
import Zoo.Fishes.Hammerfish;
import Zoo.Fishes.Sawfish;
import Zoo.Fishes.Shark;
import Zoo.Mammals.Elephant;
import Zoo.Mammals.Lion;
import Zoo.Mammals.Racoon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static ArrayList<String> listOfAnimalsName = new ArrayList<>();
    public  static ArrayList<Animal> listOfAnimals = new ArrayList<>();
    protected static void getListOfAnimal() {
        for (int i = 0; i <= listOfAnimalsName.size() - 1; i++) {
            String animals = String.format("%d. %s", i + 1, listOfAnimalsName.get(i));
            System.out.println(animals);
        }
    }
    public static void userMenu(){

        Lion bonifaci = new Lion("Bonifaci");
        Elephant dumbo = new Elephant("Dumbo");
        Racoon rocky = new Racoon("Rocky");
        Hammerfish tor = new Hammerfish("Tor");
        Sawfish saw = new Sawfish("Saw");
        Shark kilobite = new Shark("Kilobite");
        Crane confucious = new Crane("Confucious");
        Crow jet = new Crow("Jet");
        Peacock handsome = new Peacock("Handsome");

        listOfAnimals.add(bonifaci);
        listOfAnimals.add(dumbo);
        listOfAnimals.add(rocky);
        listOfAnimals.add(tor);
        listOfAnimals.add(saw);
        listOfAnimals.add(kilobite);
        listOfAnimals.add(confucious);
        listOfAnimals.add(jet);
        listOfAnimals.add(handsome);

        int choice = 0;
        System.out.println("What would you like to see? Choose any options to get more information about animal:");

        do {
            try {
                getListOfAnimal();
                System.out.println("0. Exit");
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice > 0 && choice <=9){
                    listOfAnimals.get(choice - 1).getAllInfo();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                } else if (choice > 9){
                    System.out.println("Please choose one more time.");
                }
            }catch (InputMismatchException e){
                System.out.println("Unknown command. Please, try again.");
                continue;
            }
        } while (choice !=0);

    }
}
