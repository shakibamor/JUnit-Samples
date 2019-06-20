package samples;

import org.junit.Test;

public class BagsItemTestUnit {
	BagsItem items = new BagsItem();
	String[] bag = { "Books", "Notebooks", "Pens" };

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testPrintItems() {
		System.out.println("Inside printItems()");
		items.printItems(bag);
	}
}
