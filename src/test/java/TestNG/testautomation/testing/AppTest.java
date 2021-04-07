package TestNG.testautomation.testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class AppTest extends Base {

	@Test
	@Parameters("testNG")
	public void test(String test2) {
		if (System.getenv("jenkins") != null) {
			String test = System.getenv("jenkins");
			System.out.println(test);
		}
		test.log(Status.PASS, test2);
		System.out.println("Parameter : "+test2);
		assert Boolean.TRUE;
	}

}