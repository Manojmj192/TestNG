package PageClass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Hompage {

	@BeforeSuite
	public void homeBSuite() {

		System.out.println("homebefore Suite");

	}

	@Test
	public void home() {

		System.out.println("this is homepage");

	}

	@AfterSuite
	public void homeAsuite() {

		System.out.println("home page after suite");

	}

}
