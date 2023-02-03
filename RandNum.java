import java.util.*;

public class RandNum {

	public void random() {

		Random rand = new Random(); //Create a random number
		
		int[][] array = new int [5][5];
		
		                  //Fill the array with random number
		
		for (int row = 0 ; row<array.length ; row++) {
			
			for (int column = 0 ; column<array.length ; column++){
				
				array[row][column] = rand.nextInt(100);
				
				         //print the matrix with random number
				
				System.out.print(array[row][column]+"\t");

			}
			System.out.print("\n\n\n");
		}
		
		                 //Calculate and print values
		
		double sum = 0;
		int min = array[0][0];
		int max = array[0][0];
		
		for (int row = 0 ; row<array.length ; row++) {
			
			for (int column = 0 ; column<array.length ; column++) {
				
				if(min>array[row][column]) {//check minimum
					
					min = array[row][column];
					
				}
				
				if(max<array[row][column]) {//check maximum
					
					max = array[row][column];
					
				}
				      //calculate sum of array
				
				sum = sum + array[row][column];
			}			

		}
		              //print values
		
		System.out.println("Minimum number of the matrix is "+min+".");
		
		System.out.println("Maximum number of the matrix is "+max+".");  
		
		System.out.println("Average number of the matrix is "+sum/25+".");//find average by sum / 25
		
	}
}
