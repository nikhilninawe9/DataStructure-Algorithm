package practice_demo;

public class TimeComplexity {
	public static int[] add(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}

		return arr;
	}

	public static void main(String[] args) {
		add(15000);
	}
}
