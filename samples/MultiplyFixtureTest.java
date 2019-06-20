package samples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplyFixtureTest {
	private int x;
	private int y;
	
	@Before
	public void setUp() throws Exception {
		 x = 67;
		 y = 4;
	}

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		int result = test.multiply(x, y);
		assertEquals(268, result);
	}

}
