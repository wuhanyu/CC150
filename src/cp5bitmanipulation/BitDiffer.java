/**
 * 
 */
package cp5bitmanipulation;

/**
 * @author Simon
 * @problem write a function to determine the number of bits required to convert
 *          integer A to integer B
 */
public class BitDiffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BitDiffer().getBitDifferNumber(5, 3));
	}
	
	int getBitDifferNumber(int A, int B){
		int tmp = A ^ B;
		int count = 0;
		while (tmp > 0){
			if ((tmp & 1) != 0) count++;
			tmp >>= 1;
		}
		return count;
	}

}
