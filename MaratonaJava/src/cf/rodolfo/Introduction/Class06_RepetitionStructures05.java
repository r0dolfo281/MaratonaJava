package cf.rodolfo.Introduction;

public class Class06_RepetitionStructures05 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Given a car value, find how many times this value can be portioned;
		// Condiiton: portion value >= 1000;
		double totalValue = 30000;
		for (int portion = (int) totalValue; portion >= 1; portion--) {
			double portionValue = totalValue / portion;
			if (portionValue < 1000) {
				continue;
			}
			System.out.printf("%d portion of %.2f%n", portion, portionValue);
		}
		
	}
}
