
public class BreakandCont {
	
	public void go() {
		System.out.println("First line inside go method");
		//break; // scope of break is inside loopor switch only
		//continue; scope of break is inside loop only
		System.out.println("Last line inside go method");
	}

	public static void main(String[] args) {
		//BreakandCont bc=new BreakandCont();
		//bc.go();	
		
		for(int i=0; i<=40; i++) {
			//if(i==4)
				//break;// helps to skip the iteration
			if(i>=21 && i<=28)//will not print from 21 to 28
				continue;
		System.out.println(i);
		}
		//System.out.println("outside the loop");
		
	}
}
