import java.util.Objects;

public class BubbleSort {
	String one;
	String one1;
	String one2;
	String one3;
	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 6, 2 };
		boolean sorted = true;
		while (sorted) {
			sorted = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i);
					sorted = true;
				}
			}
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(one, one1, one2, one3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BubbleSort other = (BubbleSort) obj;
		return Objects.equals(one, other.one) && Objects.equals(one1, other.one1) && Objects.equals(one2, other.one2)
				&& Objects.equals(one3, other.one3);
	}

	static void swap(int[] arr, int i) {
		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
		new BubbleSort().equals(null);
	}
}
