/*Solve the problem of Tower of hanoi.
Step 1: Move disc 1 from pole 1 to pole 2.
Step 2: Move disc 2 from pole 1 to pole 3.
Step 3: Move disc 1 from pole 1 to pole 3.

if disc 1 is a collection of n disc, same procedure, steps 1 and 3 is a collection of steps. 
step 1: move n-1 disc from pole 1 to pole 2.
step 2 :remains same
step 3: move n-1 disc from pole 1 to pole 3.
 */
package excercises;

public class TowerOfHanoi {
	public void tower(int n, String start, String auxilary, String end){
		if(n == 1){
			System.out.println(start + "->" + end);
		}else{
			tower(n-1,start,end,auxilary);
			System.out.println(start + "->" + end);
			tower(n-1,auxilary,start,end);
		}
	}
	public static void main(String args[]){
		TowerOfHanoi mytower = new TowerOfHanoi();
		mytower.tower(4,"A","B","C");
	}
}
