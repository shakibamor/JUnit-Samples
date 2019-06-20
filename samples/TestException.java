package samples;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class TestException {
    String test = null;
	@Test
	public void whenDerivedExceptionThrown_thenAssertionSucceds() {

	    assertThrows(RuntimeException.class, () -> {
	        test.length();
	    });
	}

}
