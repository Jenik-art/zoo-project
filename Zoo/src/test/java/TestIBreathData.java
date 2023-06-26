import Zoo.Birds.Crow;
import Zoo.Fishes.Shark;
import Zoo.Mammals.Lion;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)
public class TestIBreathData {
    @Test(groups = {"extended", "smoke"} )
    public static void checkMammalBreathAir(){
        Lion testLion = new Lion("Test_Lion_Name");

        String breathAir = testLion.iBreath();

        Assert.assertEquals(breathAir,"He breaths the air");
    }
    @Test(groups = "extended")
    public static void checkFishBreathWater(){
        Shark testShark = new Shark("Test_Shark_Name");

        String breathWater = testShark.iBreath();

        Assert.assertEquals(breathWater,"He breaths the water");
    }
    @Test(groups = "extended")
    public static void checkBirdBreathAir(){
        Crow testCrow = new Crow("Test_Crow_Name");
        String breathAir = testCrow.iBreath();
        boolean result;
        if (breathAir.equals("He breaths the air")){
            result = true;
        } else result = false;
        Assert.assertTrue(result, "Expected \"He breaths the air\" text is not presented");
    }
}
