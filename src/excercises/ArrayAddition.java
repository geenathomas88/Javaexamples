//Add two dimensional arrays/matrices
package excercises;

public class ArrayAddition {
	public static void main(String args[]){
		
		int arr1[][] ={{1,2,3},{4,5,6}};
		int arr2[][] = {{1,2,3},{4,5,6}};
		
		int arr3[][] =new int[2][3];
		
		for(int i =0;i<2;i++){
			for(int j= 0;j<3;j++){
				arr3[i][j] = arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
