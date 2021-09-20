import org.testng.Assert;
import org.testng.annotations.Test;

public class Trail1_Test {
	
	@Test
	public void print1() {
		System.out.println("Trail1- Passed");
	}
	
	@Test
	public void print2() {
		System.out.println("Trail2- Passed");
	}
	
	@Test
	public void print3() {
		System.out.println("Trail3- Passed");
		Assert.assertFalse(true);
	}

}
