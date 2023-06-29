import Zoo.Animal;
import Zoo.Birds.Crane;
import Zoo.Birds.Crow;
import Zoo.Fishes.Shark;
import Zoo.Mammal;
import Zoo.Mammals.Lion;
import Zoo.Mammal;
import Zoo.Menu;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(MyTestListener.class)
public class TestOfMenu extends Menu{
    @Test (groups = "smoke")
    public static void checkAddingNewAnimal(){
        Lion testLion = new Lion("Test_Lion_Name");
        listOfAnimals.add(testLion);

        Assert.assertSame(Menu.listOfAnimals.get(0),testLion);
    }

    @Test
    @Parameters(value = "xml-param")
    public static void xmlParametrizedTest(String param){
        Crane params = new Crane("CraneName");
        listOfAnimals.add(params);
        System.out.println(param + " was created and added to the list.");

        Assert.assertSame(Menu.listOfAnimals.get(0),params);
    }



    @Test(dataProvider = "shark-info-to-create")
    public static void createNewSharks(String textmessage, String name){
      Shark shark = new Shark(name);
        System.out.println(textmessage + name);

    }


    @DataProvider(name = "shark-info-to-create")
    public Object [][] objectNameAndSharkName(){
        return new Object[][]{
                {"Super dangerous shark ", "Sharkun"},
                {"Extremely beautiful shark ", "Sharkyra"},
                {"Really smart shark ", "Sharkas"}
        };
    }

    @Test (groups = "extended")
    public static void checkCrow(){
        Crow testCrow = new Crow("TestCrowName");
        SoftAssert softAssert = new SoftAssert();
        String iBreath = "He breaths the air";
        String iMove = "Special failed text";
        softAssert.assertEquals(testCrow.iBreath(), iBreath);
        softAssert.assertEquals(testCrow.iMove(), iMove);

        softAssert.assertAll();

    }

}
