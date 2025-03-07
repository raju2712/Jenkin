package Contact;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test
	public void createContactTest() {
		System.out.println("Execute createContactTest");
		String BROWSER = System.getProperty("Browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("Url");
		System.out.println(URL);
	}
	
	@Test
	public void createContactWithDateTest() {
		String BROWSER = System.getProperty("Browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("Url");
		System.out.println(URL);
		System.out.println("Execute createContactWithDateTest");
	}
	
	@Test
	public void deleteContact() {
		String BROWSER = System.getProperty("Browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("Url");
		System.out.println(URL);
		System.out.println("Execute deleteContact");
	}
}
