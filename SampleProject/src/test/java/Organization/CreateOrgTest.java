package Organization;

import org.testng.annotations.Test;

public class CreateOrgTest {

	@Test
	public void createOrgTest() {
		String BROWSER = System.getProperty("Browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("Url");
		System.out.println(URL);
		System.out.println("Execute createOrgTest");
	}
	
	@Test
	public void createOrgWithIndTest() {
		String BROWSER = System.getProperty("Browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("Url");
		System.out.println(URL);
		System.out.println("Execute createOrgWithIndTest");
	}
}
