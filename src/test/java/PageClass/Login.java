package PageClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Login {
	@BeforeSuite
	public void bsuite() {
		System.out.println("this will run before each suit");

	}

	@BeforeClass
	public void before() {
   System.out.println("it will as been beforeclass");

	}
	@AfterClass
	public void after() {
		System.out.println("it has been afterclass");

	}
	
	
	
	@AfterSuite
	public void aS() {

		System.out.println("it will run after each suit");

	}

	@Test()
	@Parameters("Name")
	public void ll(String name) {

		System.out.println("this is login functionlity by " + name);

	}
	
	
	@Test
	public void log() {
		
		System.out.println("this logout function");
		
		

	}
	
	@BeforeMethod
	public void bMethod() {
		System.out.println("it will execute before method");

	}
	
	@AfterMethod
	public void aMethod() {
		
		System.out.println("it will execute after method");

	}

}
