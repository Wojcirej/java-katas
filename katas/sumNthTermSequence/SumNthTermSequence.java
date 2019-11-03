package katas.sumNthTermSequence;

public class SumNthTermSequence {
	
	public static String call(int n) {
		if (n == 0) {
			return "0,00";
		}
		if (n == 1) {
			return "1,00";
		}
		double sum = 1.0;
		for (int i = 1; i < n; ++i) {
			sum = sum + (1.0 / (i * 3 + 1));
		};
		return String.format("%.2f", sum);
	};
}
