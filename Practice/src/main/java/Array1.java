import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 7, 8, 9, 1, 4, 7 };
		int max=0;
		int min=array[0];
		System.out.println("Array");
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			
		}
		System.out.println(max+"MMMMMMMMMMAX");
	
	for(int j=0;j<array.length;j++) {
		if(array[j]<min) {
			min=array[j];
		}
	}
	System.out.println(min+"MIIIIIIIIIIIIIIIIIIINNNNNNNN");
}
}
