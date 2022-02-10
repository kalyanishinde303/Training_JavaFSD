package Phase1.assestedPracticeProject;


public class LinearSearch {
	
	public static void main(String[] args) {
        
		int searchItem = 3;
		LinearSearch demo = new LinearSearch();
		boolean status = demo.linearSearch(searchItem);
		if (status)
			System.out.println("found");
		else
			System.out.println("Not found");

}

	int[] arr = {5, 8, 1, 6, 9, 3, 7, 2, 4};
	 
	public  boolean linearSearch(int searchItem) {
		boolean isFound = false;
		int size = arr.length;
		System.out.println("The number of elements present in an array is: " + size);
		for(int i = 0; i < size; i++) {
			int value = arr[i];
			if(value == searchItem) {
				System.out.println("The value found at index:" +i);
				isFound = true;
				break;
			}
		}
		return isFound;
	}
}
