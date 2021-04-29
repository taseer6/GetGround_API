import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import services.PeopleService;

public class PostCodeTest {

    PeopleService peopleEndpoint;
    String peopleNumber = "1/";

    //initializes the
    @BeforeTest
    public void init() {
        peopleEndpoint = new PeopleService();
    }

    @Test
    public void getResponseOfAPI() {
        peopleEndpoint.printAPIResponse(peopleNumber);
    }

    @Test
    public void verifyName() {
        String actualName = "Luke Skywalker";
        Assert.assertEquals(actualName, peopleEndpoint.getPeople(peopleNumber).getName());
    }


    @Test
    public void verifyHeight() {
        String actualHeight = "172";
        Assert.assertEquals(actualHeight, peopleEndpoint.getPeople(peopleNumber).getHeight());
    }


    @AfterMethod //AfterMethod annotation - This method executes after every test execution
    public void printFailedTCResponse(ITestResult result) throws InterruptedException {
        //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
        if (ITestResult.FAILURE == result.getStatus()) {
            System.out.println("Name of Failed TC ====  " + result.getMethod().getMethodName());
        }
    }


}
