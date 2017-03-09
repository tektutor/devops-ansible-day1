package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleAdditionTest {

	@Test
	public void simpleAddition() {
		SimpleAddition simpleAddition = new SimpleAddition();

		int actualResult = simpleAddition.add ( 10, 20 );
		int expectedResult = 30;
		assertEquals ( expectedResult, actualResult );

		actualResult = simpleAddition.add ( 100, 200 );
		expectedResult = 300;
		assertEquals ( expectedResult, actualResult );
	}

}
