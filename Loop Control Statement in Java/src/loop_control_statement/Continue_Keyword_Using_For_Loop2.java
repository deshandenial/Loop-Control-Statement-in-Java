package loop_control_statement;

public class Continue_Keyword_Using_For_Loop2 
{

	public static void main(String[] args) {
		
		int [] numbers = {10,20,30,40,50};
		
		for(int x : numbers)
		{
			if(x==30)
			{
				continue;
			}
			
			System.out.println("print x value:"+x);
		}
	}
}
