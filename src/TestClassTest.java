import static org.junit.Assert.*;

import org.junit.Test;


public class TestClassTest {

	@Test
	public void testAdd() {
		assertEquals(50, TestClass.add(20, 30));
		int i = 0;
		for (i = 0; i < 3000; i++){
			assertEquals(i, TestClass.add(i-1, 1));
		}
	}

}
