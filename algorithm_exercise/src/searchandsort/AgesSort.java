package searchandsort;

public class AgesSort {
	public int[] sortAges(int[] ages, int length) {
		if(ages == null || length <= 0) {
			try {
				throw new Exception("age is null.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		int oldestAge = 99;
		int[] timesOfAge = new int[oldestAge + 1];
		for(int i = 0; i < length; i++) {
			int age = ages[i];
			if(age < 0 || age > oldestAge) {
				try {
					throw new Exception("age out of range.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			timesOfAge[age]++;
		}
		int index = 0;
		for(int i = 0; i < oldestAge; i++) {
			for(int j = 0; j < timesOfAge[i]; j++) {
				ages[index] = i;
				index++;
			}
		}
		return ages;
	}
	
	public static void main(String[] args) {
		AgesSort agesSort = new AgesSort();
		int[] ages = {32, 21, 32, 25, 21};
		agesSort.sortAges(ages, 5);
		for(int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		
	}
}
