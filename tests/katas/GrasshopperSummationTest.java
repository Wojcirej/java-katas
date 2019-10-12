package tests.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import katas.grasshopperSummation.GrasshopperSummation;

class GrasshopperSummationTest {

	@DisplayName("GrasshopperSummation.call")
	@ParameterizedTest(name = "when n = {0} it returns {1}")
	@CsvFileSource(resources = "/tests/support/testCases/grasshopperSummation.csv")
	void testCall(int n, int result) {
		assertEquals(GrasshopperSummation.call(n), result);
	}

}
