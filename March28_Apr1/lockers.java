package March28_Apr1;

import java.util.HashMap;


// Doing this with Nick Anderson
public class lockers {
	
	private static int openLocker(int num) {
		int count = 0;
		// Closed = 0, Open = 1;
		int[] array_lockers = new int[num];
		
		// When the locker is opened = 1
		for (int i = 1; i <= num; i++) {
			for (int j = i - 1; j <= num - 1; j += i) {
				if(array_lockers[j] == 0) {
					array_lockers[j] = 1;
				} else {
					array_lockers[j] = 0;
				}
			}
		}
		
		// When the locker is closed = 0;
		for (int i = 0; i < num; i++) {
			if (array_lockers[i] == 1) {
				count++;
			}
		}
		
		return count;
	}

	
	public static void main(String[] args) {
		System.out.println("The number of opened lockers in 100 is " + openLocker(100));
	}

}
