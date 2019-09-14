public class NestedLoops {
	public static void main(String[] args) {
/*while --> 3 times
 * for --> 4 times
 * do-while -->5 times
 *so total 60 times*/
		
		int i=0; int count =0;
		while(i<3) 
		{
			for (int j=0; j<4; j++) 
			{
				int k=0;
				do 
				{
					System.out.println("i-->"+i+"  j-->"+j+"  k-->"+k);
					k++;
					count++;
					
				} while(k<5);
			}
			i++;
		}
		// here the loop is completed 
		System.out.println("--------------------------------");
		System.out.println("The total iteration count is: "+count);
	}

}
