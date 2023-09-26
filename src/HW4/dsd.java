package HW4;

public class dsd {

	
		public static void main(String[] args) {
		String[] data = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			String s = data[i];
			for (int j = 0; j < s.toCharArray().length; j++) {
				char c = s.toCharArray()[j];
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
