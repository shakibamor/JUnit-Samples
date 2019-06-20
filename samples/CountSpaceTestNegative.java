package samples;

import static org.junit.Assert.*;

import org.junit.Test;



public class CountSpaceTestNegative {

	@Test
	public void test() {
		JunitTest test = new JunitTest();
		int numberOfSpaces = test.countSpaces("This String needs to be tested for number of spaces");
		 assertFalse(  numberOfSpaces == 4);
	}

}
