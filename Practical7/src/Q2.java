/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeoh Ming Zhe
 */
public class Q2 {
    public static double computeTotalCollection(PatientBill[] arr) {
		double total = 0.0;
		
		for (int i = 0; i < arr.length; ++i)
			total += arr[i].calTotalCharges();
		
		return total;	
	}
	
	public static void main(String [] args){
		PatientBill[] bills = new PatientBill[4];
		bills[0] = new OutpatientBill("Zoe Smith", 30.00);
		bills[1] = new InpatientBill("Mary Yan",  500.0, 50.00, 'S', 8);
		bills[2] = new InpatientBill("Jack Sparrow", 200, 12.50,'P', 10);
		bills[3] = new OutpatientBill("Andy Lau" , 50.00);
		
		System.out.println("Original array: ");
		for (int i = 0; i < bills.length; ++i)	
			System.out.println("\n" + bills[i]);
		
		bills = selectionSort(bills);
	
		System.out.println("\n\nBills sorted in alphabetical order of name: ");
		
	
		for (int i = 0; i < bills.length; ++i)	{
			System.out.println("\n" + bills[i]);
			System.out.printf("Total collection: RM%.2f\n", bills[i].calTotalCharges());
		}
		System.out.println("Total bills = RM "+computeTotalCollection(bills)	);
	}
	
	public static PatientBill[] selectionSort(PatientBill[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			int indexOfSmallest = i;	// assign the first index of the subarray as the initial indexOfSmallest
			for (int j = i+1; j < arr.length; ++j) {
				if (arr[j].compareTo(arr[indexOfSmallest]) < 0) // if the current array element is smaller than the
					indexOfSmallest = j;														// element at indexOfSmallest, update indexOfSmallest
			}
			// swap the element at indexOfSmallest with the current subarray's first element 																									
			PatientBill tempArr = arr[indexOfSmallest];
			arr[indexOfSmallest] = arr[i];
			arr[i] = tempArr;
		}
		return arr;
	}
}
