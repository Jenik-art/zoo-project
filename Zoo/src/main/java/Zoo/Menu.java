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

import java.util.Scanner;

public class Menu {
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
        int choice;
        System.out.println("What would you like to see? Choose any options to get more information about animal:");
        do {
            Animal.getListOfAnimal();
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            choice =scanner.nextInt();
            scanner.nextLine();

            // Block of choice
            switch (choice){
                case 1:
                    bonifaci.getAnimal();
                    bonifaci.iBreath();
                    bonifaci.iMove();
                    bonifaci.uniqueAction();
                    System.out.println();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                    break;
                case 2:
                    dumbo.getAnimal();
                    dumbo.iBreath();
                    dumbo.iMove();
                    dumbo.uniqueAction();
                    System.out.println();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                    break;
                case 3:
                    rocky.getAnimal();
                    rocky.iBreath();
                    rocky.iMove();
                    rocky.uniqueAction();
                    System.out.println();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                    break;
                case 4:
                    tor.getAnimal();
                    tor.iBreath();
                    tor.iMove();
                    tor.uniqueAction();
                    System.out.println();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                    break;
                case 5:
                    saw.getAnimal();
                    saw.iBreath();
                    saw.iMove();
                    saw.uniqueAction();
                    System.out.println();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                    break;
                case 6:
                    kilobite.getAnimal();
                    kilobite.iBreath();
                    kilobite.iMove();
                    kilobite.uniqueAction();
                    System.out.println();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                    break;
                case 7:
                    confucious.getAnimal();
                    confucious.iBreath();
                    confucious.iMove();
                    confucious.uniqueAction();
                    System.out.println();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                    break;
                case 8:
                    jet.getAnimal();
                    jet.iBreath();
                    jet.iMove();
                    jet.uniqueAction();
                    System.out.println();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                    break;
                case 9:
                    handsome.getAnimal();
                    handsome.iBreath();
                    handsome.iMove();
                    handsome.uniqueAction();
                    System.out.println();
                    System.out.println("Would you like to see other animal?");
                    System.out.println();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose one more time.");
            }
        } while (choice !=0);

    }
}
