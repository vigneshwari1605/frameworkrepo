package pac2;

import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void createorgTest() {
			
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute CreateContactTest");
		System.out.println("execute Createorg Test");
				
	}
	
	@Test
	public void modifyorgTest() {
		System.out.println("execute modify org");
	}
}
