package samples;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;



public class FirstRepeatingTest {
	JunitTest test = new JunitTest();
	@Test
	public void test() {
	
		char repeatingChar = test.firstRepeating("Shakiba".toCharArray());
		assertEquals('a', repeatingChar);
	}
	
	@Ignore
	@Test
	public void secondTest() {

		char repeatingChar = test.firstRepeating("Shakiba".toCharArray());
		assertEquals('b', repeatingChar);
	}

}
