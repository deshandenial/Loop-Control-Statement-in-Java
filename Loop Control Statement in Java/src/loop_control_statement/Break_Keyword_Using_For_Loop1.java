package loop_control_statement;

public class Break_Keyword_Using_For_Loop1 
{
	public static void main(String[] args) {
		
		for(int x = 50; x>=0; x=x-10)
		{
	
			if(x==30)
			{
			 break;
			}
			
			System.out.println("print x value:"+x);
		}
	}

}
