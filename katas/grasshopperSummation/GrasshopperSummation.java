package katas.grasshopperSummation;

public class GrasshopperSummation {
	
	public static int call(int n) {
		int sum = 0;
		for (int i = 1; i <= n; ++i) {
			sum += i;
		}
		return sum;
	};

}
