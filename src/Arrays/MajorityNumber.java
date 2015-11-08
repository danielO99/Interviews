package Arrays;
//Author: Daniel Olvera (danog99@gmail.com)

//Majority Number: Given an array of integers find if there is an element
//which occurs more than half of the array's size.

//This algorith complexion time is O(n) where n is the size of the array and space complexity O(1)
//This is the best we can do since we have to go over all the elements in the array

public class MajorityNumber {
	public static int findMajorityNumber(int[] array){
		//Using Moore algorithm to find the most common element of the array
		int count = 0;
		int majNumber = 0;
		int sizeArr = array.length;
		for(int i=0; i<sizeArr; i++){
			if(count==0 && majNumber!=array[i]){
				majNumber=array[i];
			}
			else if(majNumber!=array[i]){
				count--;
			}
			else{
				count++;
			}
		}
		if(count>=sizeArr/2){			
			return majNumber;
		}
		//Assumption, array must be all positive numbers
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arrTest = new int[]{1,2,3,4,5,6,7,5,5};
		System.out.println("The maj number is: "+findMajorityNumber(arrTest));

	}

}
