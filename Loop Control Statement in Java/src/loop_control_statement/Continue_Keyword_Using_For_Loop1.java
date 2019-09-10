package loop_control_statement;

public class Continue_Keyword_Using_For_Loop1 
{
	
	public static void main(String[] args) {
		
		for(int x=50; x>=0;x=x-10)
		{
			if(x==30)
			{
				continue;
			}
			System.out.println("print x value:"+x);
		}
	}

}
