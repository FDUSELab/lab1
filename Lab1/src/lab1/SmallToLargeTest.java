package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmallToLargeTest {
	SmallToLarge sf;

	@Before
	public void setUp() throws Exception {
		sf = new SmallToLarge();
	}

	@Test(timeout=1000)
	public void test() {
		Assert.assertEquals(0.4, sf.sizeCost(new Decaf("small", sf)), 0); 
		Assert.assertEquals(0.7, sf.sizeCost(new Decaf("medium", sf)), 0); 
		Assert.assertEquals(1.0, sf.sizeCost(new Decaf("large", sf)), 0); 
		
		Assert.assertEquals(0.2, sf.sizeCost(new RedTea("small", sf)), 0); 
		Assert.assertEquals(0.5, sf.sizeCost(new RedTea("medium", sf)), 0); 
		Assert.assertEquals(0.7, sf.sizeCost(new RedTea("large", sf)), 0); 
		
		String[] sizes = {"small", "medium", "large"};
		Assert.assertArrayEquals(sizes, sf.getAllSizes());
	}

}
