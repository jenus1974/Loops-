//boolean condition, if the condition is true 
//then go inside loop, otherwise outside
//when, number of iteration is not known 
public class WhileLoop {

	public static void main(String[] args) {
		int i=0;
		while (i<9) {
			System.out.println(i);
			i++;// if no iteration then loop will not stop
		}		
	}
}
/*While loop--> when number of iteration is not known (while (true))
 * For loop --> when num of iterationis known
 * do while loop--> runs at-least 1 time (inside do) irrespective of condition
 */