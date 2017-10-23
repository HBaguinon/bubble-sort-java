public class BubbleSort {
	public static void main(String[] args){
		
		int numArray[] = {8, 5, 3, 2, 9};
		int temp;
		bool swapped = false;
		while(swapped = false){
			for (int i = 0; i < numArray.length - 1; i++)
				if (numArray[i] > numArray[i+1]) {
					temp = numArray[i];
					numArray[i] = numArray[i+1];
					numArray[i+1] = temp;
					swapped = true;
				}
		}
	}
}