package loop_control_statement;

public class Break_Keyword_Using_For_Loop2 

{

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40,50};
		
		for(int x: numbers)
		{
			System.out.println("print outer loop x value:"+x);
			if(x==40)
			{
				System.out.println("print x value:"+x);
			break;
			}
		}
	}
}
