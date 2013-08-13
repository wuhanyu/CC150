import java.util.Arrays;

/**
 * 
 */

/**
 * @author Simon@itechs
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 1, 2, 6, 8, 9, 5, 4, 2, 1, 5, 7, 3, 6, 43, 243};
		quickSort(0, array.length - 1, array);
		System.out.println(Arrays.toString(array));
	}
	
	static void quickSort(int start, int end, int[] array){
		int tmp = array[start];
		int i = start;
		int j = end;
		while (i < j){
			while (i < j && array[j] > tmp) j--;
			if (i < j) array[i] = array[j];
			while (i < j && array[i] <= tmp) i++;
			if (i < j) array[j] = array[i];
		}
		array[i] = tmp;
		if (start < i - 1) quickSort(start, i - 1, array);
		if (i + 1 < end) quickSort(i + 1, end, array);
	}

}
