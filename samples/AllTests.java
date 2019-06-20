package samples;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CountSpaceTestNegative.class, CountSpaceTestPositive.class, 
	FirstRepeatingTest.class, MultiplyFixtureTest.class, TestException.class, BagsItemTestUnit.class, PrimeNumberTestUnit.class })
public class AllTests {
  

}
