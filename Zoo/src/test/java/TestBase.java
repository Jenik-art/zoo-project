import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyTestListener.class)
public class TestBase {
    @BeforeGroups(groups = "smoke")
    public static void smokeBeforeGroupTest(){
        System.out.println("Smoke Before group test");
    }

    @BeforeGroups(groups = "extended")
    public static void extendedBefoereGroupTest(){
        System.out.println("Extended Before group test");
    }


}
