public class BubbleSort {
	public static void main(String[] args){
		
		int numArray[] = {8, 5, 3, 2, 9};
		int temp;
		boolean fixed = false;
		for (int i = 0; i < numArray.length; i++){
			System.out.print(numArray[i]+" ");
		}
		System.out.println("");
		while(fixed == false){
			fixed = true;
			for (int i = 0; i < numArray.length - 1; i++)
				if (numArray[i] > numArray[i+1]) {
					temp = numArray[i];
					numArray[i] = numArray[i+1];
					numArray[i+1] = temp;
					fixed = false;
				}
		}
		for (int i = 0; i < numArray.length; i++){
			System.out.print(numArray[i]+" ");
		}
	}
}