package samples;

import static org.junit.Assert.*;

import org.junit.Test;



public class CountSpaceTestPositive {

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		int numberOfSpaces = test.countSpaces("This String needs to be tested for number of spaces");
		assertEquals(9, numberOfSpaces);
	}

}
