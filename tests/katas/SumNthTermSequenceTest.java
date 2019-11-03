package tests.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import katas.sumNthTermSequence.SumNthTermSequence;

class SumNthTermSequenceTest {

	@DisplayName("SumNthTermSequence.call")
	@ParameterizedTest(name = "when n = {0} it returns {1}")
	@CsvFileSource(resources = "/tests/support/testCases/sumNthTermSequence.csv")
	void testCall(int n, String result) {
		assertEquals(SumNthTermSequence.call(n), result);
	}

}
